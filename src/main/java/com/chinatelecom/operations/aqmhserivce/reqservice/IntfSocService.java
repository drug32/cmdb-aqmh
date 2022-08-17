package com.chinatelecom.operations.aqmhserivce.reqservice;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chinatelecom.operations.aqmhserivce.entity.*;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.*;
import com.chinatelecom.operations.aqmhserivce.mapper.*;
import com.chinatelecom.operations.aqmhserivce.service.*;
import com.chinatelecom.operations.aqmhserivce.service.impl.IntfSocJixianServiceImpl;
import com.chinatelecom.operations.aqmhserivce.utils.*;
import com.chinatelecom.udp.core.datarouter.IDataResponse;
import com.chinatelecom.udp.core.datarouter.IWorkService;
import com.chinatelecom.udp.core.datarouter.ServiceMethodInfo;
import com.chinatelecom.udp.core.datarouter.WebContextHolder;
import com.chinatelecom.udp.core.datarouter.exception.DataException;
import com.chinatelecom.udp.core.datarouter.response.JsonResponse;
import com.chinatelecom.udp.core.lang.json.JsonArray;
import com.chinatelecom.udp.core.lang.json.JsonObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tinkerpop.gremlin.process.traversal.P;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



@Component
public class IntfSocService implements IWorkService {
    private final static Logger logger= LogManager.getLogger(IntfSocService.class);
    @Autowired
    private EmpeeAcctInfoService empeeAcctInfoService;
    @Autowired
    private com.chinatelecom.operations.aqmhserivce.service.IntfSocDjxtService intfSocDjxtService;
    @Autowired
    private IntfSocItZichanService intfSocItZichanService;
    @Autowired
    private IntfSocJixianService intfSocJixianService;
    @Autowired
    private IntfSocXitongbaolumianService intfSocXitongbaolumianService;
    @Autowired
    private IDeptInfoService deptInfoService;
    @Autowired
    private VOrgTreeAllStaffInfoMapper staffInfoMapper;
    @Autowired
    private IntfSocDjxtMapper intfSocDjxtMapper;
    @Autowired
    private IntfSocIpbaolumianMapper intfSocIpbaolumianMapper;
    @Autowired
    private IIntfSocIpbaolumianService intfSocIpbaolumianService;
    @Autowired
    private VOrgTreeAllStaffInfoMapper vOrgTreeAllStaffInfoMapper;
    @Autowired
    private IIntfTsgzAlarmService intfTsgzAlarmService;
    @Autowired
    private IntfTsgzAlarmMapper  intfTsgzAlarmMapper;

    @Autowired
    private IntfIdcPortBlackListMapper intfIdcPortBlackListMapper;
    @Autowired
    private IntfIdcPortBlackListService intfIdcPortBlackListService;
    @Autowired
    private HoneypotLogService honeypotLogService;
    @Autowired
    private RegistrationRecordService registrationRecordService;
    @Autowired
    private IntfSocJixianMapper intfSocJixianMapper;
    @Autowired
    private TsMessageMapper tsMessageMapper;

    /** @Author 孙虎
     * @Description //获取某个系统的相关信息
     * @date 9:45 2022/5/31
     * @Param [sysId]
     * @return com.chinatelecom.udp.core.datarouter.IDataResponse
     **/
    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getSystemInfo(String sysId) throws DataException, IOException, SQLException {
        logger.info("=================>获取系统的相关信息,getSystemInfo方法入参sysId为：" +sysId);
        List<IntfSocDjxt> intfSocDjxtList = intfSocDjxtService.list(new QueryWrapper<IntfSocDjxt>().eq("id", sysId));
        if(StringUtils.isEmpty(sysId)||intfSocDjxtList==null||intfSocDjxtList.size()==0){
            return new JsonResponse(new JsonResult("系统ID不存在，请核实入参",false));
        }
        IntfSocDjxt intfSocDjxt = intfSocDjxtList.get(0);
        JsonObject object = new JsonObject();
        //查询出指定业务系统的应用程序资产
        long countForApp = intfSocItZichanService.count(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId).likeRight("category", "4"));
        //查询出指定业务系统的数据库资产
        long countForDb = intfSocItZichanService.count(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId).likeRight("category", "403"));
        //查询出指定业务系统的主机资产
        long countForMachine = intfSocItZichanService.count(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId).likeRight("category", "1"));
        /*List<IntfSocItzichan> itZiChanList = intfSocItZichanService.list(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId));
        List<String> assetIdList = itZiChanList.stream().map(IntfSocItzichan::getAssetId).collect(Collectors.toList());*/
        //获取该系统的登录次数以及各种类型的员工的登录次数
        List<GetLoginTimes> loginTimesList = intfSocDjxtMapper.getLoginTimes("CTAHMSSOA20130002");
        //查询出指定业务系统的系统暴露面
        long countForXitongbaolumian = intfSocXitongbaolumianService.count(new QueryWrapper<IntfSocXitongbaolumian>().eq("system_id", sysId));
        if(countForXitongbaolumian>0){
            object.put("xitongbaolumian",countForXitongbaolumian);
        }
        //获取该系统的态势警告信息的攻击次数
        List<IntfSocItzichan> machineList = intfSocItZichanService.list(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId).likeRight("category", "1"));
        Set<String> ipSet = getSystemAllMachineIp(machineList);
        int tsCount = intfTsgzAlarmMapper.getTsCount(ipSet);
        object.put("name", intfSocDjxt.getName());
        object.put("baName", intfSocDjxt.getBusinessnameLevel());
        object.put("chengXu", countForApp);
        object.put("shuJuKu", countForDb);
        object.put("zhuJi", countForMachine);
        object.put("loginTimes", loginTimesList);
        object.put("tsCount", tsCount);
        return new JsonResponse(new JsonResult(object));
    }


    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getSystemInfoList(String orgId) throws DataException, IOException, SQLException {
        logger.info("111111111111111111111");
        List<IntfSocDjxt> list = intfSocDjxtService.list(new QueryWrapper<IntfSocDjxt>().eq("company_id",orgId));
        return new JsonResponse(new JsonResult(list));
    }


    /** @Author 孙虎
     * @Description //获取首页数据
     * @date 9:45 2022/5/31
     * @Param []
     * @return com.chinatelecom.udp.core.datarouter.IDataResponse
     **/
    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getHomePageData() throws DataException, IOException, SQLException {
        logger.info("开始获取首页数据=======================>");
        //展示所有单位
        List<DeptInfo> list = deptInfoService.list(new QueryWrapper<DeptInfo>().eq("parent_id","0"));
        //工号数量
        int staffCount = staffInfoMapper.getStaffCount(null);
        //各个单位的主机资产数量
        List<OrgMachineNum> orgMachineNumList = intfSocDjxtMapper.getOrgMachineNum();
        //
        long jiXianAll = intfSocJixianService.count();
        long jiXianSuccess = intfSocJixianService.count(new QueryWrapper<IntfSocJixian>().eq("item_result", "1"));
        // 创建一个数值格式化对象
        NumberFormat numberFormat = NumberFormat.getInstance();
        //系统总数
        long systemCount = intfSocDjxtService.count();
        // 设置精确到小数点后2位
        numberFormat.setMaximumFractionDigits(2);
        String result = numberFormat.format((float) jiXianSuccess / (float) jiXianAll * 100).concat("%");
        List<Map<String, String>> staffKindAndNumMap = vOrgTreeAllStaffInfoMapper.getStaffKindAndNum();
        JsonObject object = new JsonObject();
        object.put("deptList", list);
        object.put("staffCount",staffCount);
        object.put("orgMachineNumList",orgMachineNumList);
        object.put("jiXianSucuessRate", result);
        object.put("staffInfo", staffKindAndNumMap);
        object.put("systemCount", systemCount);
        return new JsonResponse(new JsonResult(object));
    }


    /** @Author 孙虎
     * @Description //获取单位下的数据(主机数量，系统列表，员工账号数）
     * @date 9:45 2022/5/31
     * @Param [orgId, orgName]
     * @return com.chinatelecom.udp.core.datarouter.IDataResponse
     **/
    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getOrgData(String orgId,String orgName) throws DataException, IOException, SQLException {
        logger.info("开始获取单位数据=======================>");
        JsonObject object = new JsonObject();
        //该单位拥有的系统个数
        List<IntfSocDjxt> systemList = intfSocDjxtService.list(new QueryWrapper<IntfSocDjxt>().eq("company_id", orgId));
        //该单位拥有的工号数量(根据单位名称匹配的，有的对应不上，比如省IT中心==省企业信息化部）
        int staffCount = staffInfoMapper.getStaffCount( DeptNameMapUtils.map.get(orgName));
        //该单位的主机资产数量
        List<OrgMachineNum> orgMachineNumList = intfSocDjxtMapper.getOrgMachineNum();
        int orgMachineCount = 0;
        for (OrgMachineNum orgMachineNum : orgMachineNumList) {
            if(orgId.equals(orgMachineNum.getOrgId())){
                orgMachineCount=Integer.valueOf(orgMachineNum.getNum());
            }
        }
        object.put("orgMachine",orgMachineCount);
        object.put("systemList", systemList);
        object.put("staffCount",staffCount);
        return new JsonResponse(new JsonResult(object));
    }

    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getItZichanList(JsonObject object) throws Exception {
        //入参校验
        Map<String, Object> map = PageUtils.checkPageParams(object.toMap());
        if (!map.containsKey(Constant.SYS_ID)) {
            return new JsonResponse(new JsonResult("系统ID为空，请检查", false));
        }
        //分页查询
        IPage<IntfSocItzichan> page = intfSocItZichanService.page(new Query<IntfSocItzichan>().getPage(map),
                new QueryWrapper<IntfSocItzichan>()
                        .eq(map.get(Constant.SYS_ID) != null, "asset_group_id", map.get(Constant.SYS_ID))
                        .like(StringUtils.isNotBlank((String) map.get("kind")), "category", map.get("kind")));
        JsonObject dataFromPage = PageUtils.getDataFromPage(new PageUtils(page));
        JsonArray array =(JsonArray)dataFromPage.get("list");
        List<IntfSocItzichan> intfSocItzichanList =new ArrayList<>();
        ArrayList<JsonObject> itZiChanList = array.toList(JsonObject.class);
        for (JsonObject JsonObject : itZiChanList) {
            IntfSocItzichan itZichanEntity = JsonObject.toBean(IntfSocItzichan.class);
            intfSocItzichanList.add(itZichanEntity);
        }
        dataFromPage.put("list",itZiChanList);
        return new JsonResponse(new JsonResult(dataFromPage));
    }


    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getIpBaoLuMian() throws Exception {
        JsonObject object = new JsonObject();
        long count = intfSocIpbaolumianService.count();
    /*    //查询出所有部门
        List<DeptInfo> deptInfoList = deptInfoService.list(new QueryWrapper<DeptInfo>().eq("parent_id","0"));
        List<DeptIpBaoLuMian> deptIpBaoLuMianList=new ArrayList<>();
        DeptIpBaoLuMian deptIpBaoLuMian;
        //查询出各个部门的暴露面总数
        for (DeptInfo deptInfo : deptInfoList) {
            int ipbaolumianNum = intfSocIpbaolumianMapper.getDeptIpBaoLuMian(deptInfo.getDeptId());
            if(ipbaolumianNum>0){
                deptIpBaoLuMian=new DeptIpBaoLuMian();
                deptIpBaoLuMian.setDeptId(deptInfo.getDeptId());
                deptIpBaoLuMian.setNum(ipbaolumianNum);
                deptIpBaoLuMian.setDeptName(deptInfo.getDeptName());
                deptIpBaoLuMianList.add(deptIpBaoLuMian);
            }
        }*/
        //查询出所有部门的系统的暴露面总数
        List<DeptIpBaoLuMian> deptIpBaoLuMianList = intfSocIpbaolumianMapper.getDeptIpBaoLuMianAll();
        object.put("ipbaolumian",count);
        object.put("deptIpBaoLuMianList",deptIpBaoLuMianList);
        return new JsonResponse(new JsonResult(object));
    }

    private Set<String> getSystemAllMachineIp(List<IntfSocItzichan> machineList) {
        Set<String> returnSet = new HashSet<>();
        for (IntfSocItzichan itzichan : machineList) {
            if (!itzichan.getMgmtIp().equals("null")) {
                returnSet.add(itzichan.getMgmtIp());
            }
            if (!itzichan.getPublicIp().equals("null")) {
                returnSet.addAll(Arrays.asList(getIpSplit(itzichan.getPublicIp())));
            }
            if (!itzichan.getDcnIp().equals("null")) {
                returnSet.addAll(Arrays.asList(getIpSplit(itzichan.getDcnIp())));
            }
            if (!itzichan.getCn2Ip().equals("null")) {
                returnSet.addAll(Arrays.asList(getIpSplit(itzichan.getCn2Ip())));
            }
            if (!itzichan.getPrivateIp().equals("null")) {
                returnSet.addAll(Arrays.asList(getIpSplit(itzichan.getPrivateIp())));
            }
            if (!itzichan.getPubManualIp().equals("null")) {
                returnSet.addAll(Arrays.asList(getIpSplit(itzichan.getPubManualIp())));
            }
            if (!itzichan.getFloatingIp().equals("null")) {
                returnSet.addAll(Arrays.asList(getIpSplit(itzichan.getFloatingIp())));
            }
            if (!itzichan.getHostMappingIp().equals("null")) {
                returnSet.addAll(Arrays.asList(getIpSplit(itzichan.getHostMappingIp())));
            }
            if (!itzichan.getDcnManualIp().equals("null")) {
                returnSet.addAll(Arrays.asList(getIpSplit(itzichan.getDcnManualIp())));
            }
        }
        return returnSet;
    }

    /**
     * 查询intfIdcPortBlackList所有记录数以及citycode分组记录数
     * @return IDataResponse
     */
    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getIdcPortBlackList() {
        JsonObject object = new JsonObject();
        //查询所有记录数
        long count = intfIdcPortBlackListService.count();

        //根据cityCode分组展示总数，并增排序
        List<GroupByCityCodeCount> groupByCityCodeList = intfIdcPortBlackListMapper.getCountByCityCode();
        object.put("allCount",count);
        object.put("groupByCityCodeList",groupByCityCodeList);
        return new JsonResponse(new JsonResult(object));
    }

    /**
     * 查询honeypotLog所有记录数
     * @return IDataResponse
     */
    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getHoneyPotInfo() {
        JsonObject object = new JsonObject();
        //查询所有记录数
        long count = honeypotLogService.count();
        object.put("allCount",count);
        return new JsonResponse(new JsonResult(object));
    }

    /**
     * 查询registrationRecord所有记录数
     * @return IDataResponse
     */
    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getRegistrationRecordList() {
        JsonObject object = new JsonObject();
        //查询所有记录数
        long count = registrationRecordService.count();
        //根据citycode分组展示总数，并增排序
        List<RegistrationRecord> registrationRecordList = registrationRecordService.list();
        object.put("allCount",count);
        object.put("registrationRecordList",registrationRecordList);
        return new JsonResponse(new JsonResult(object));
    }

    /**
     * 根据ip查询intfSocJixian基线相关信息，检查总量，检查项合格量不合格量以及合格率
     * @param object
     * @return
     * @throws Exception
     */
    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getJixianInfo(JsonObject object) throws Exception {
        JsonObject jsonObject = new JsonObject();
        //入参校验
        Map<String, Object> map = PageUtils.checkPageParams(object.toMap());
        //查询检查点不通过的项数
        List<IntfSocJixian> noPassList = intfSocJixianMapper.noPassList(map.get("ip").toString());
        //新增日期格式转换
        for(IntfSocJixian i : noPassList) {
            i.setCheckTime(dateTransport(i.getCheckTime()));
        }
        jsonObject.put("data",noPassList);
        //查询检查总量
        Long totalCount = intfSocJixianMapper.getAllAssetCount(map.get("ip").toString());
        jsonObject.put("totalCount",totalCount);
        //查询检查项不通过的数量
        Long typeFailedCount = intfSocJixianMapper.getCount(map.get("ip").toString(),"2");
        //查询检查项通过的数量
        Long typePassCount = intfSocJixianMapper.getCount(map.get("ip").toString(),"1");
        jsonObject.put("failedCount",typeFailedCount);
        float passRate = 0.0f;
        if(typePassCount + typeFailedCount != 0) {
            passRate = (float) typePassCount / (float) (typePassCount + typeFailedCount);
        }
        jsonObject.put("passRate",passRate);
        return new JsonResponse(new JsonResult(jsonObject));
    }

    ///**
    // * 根据ip查询青藤云用户账号相关信息
    // * @param object
    // * @return
    // * @throws Exception
    // */
    //@ServiceMethodInfo(authentincation = false)
    //public IDataResponse getUserAccountInfo(JsonObject object) throws Exception {
    //    JsonObject jsonObject = new JsonObject();
    //    //入参校验
    //    Map<String, Object> map = PageUtils.checkPageParams(object.toMap());
    //    //调用青藤云接口
    //    JsonObject request = new JsonObject();
    //    request.put("ip",object.get("ip"));
    //    ObjectMapper mapper = new ObjectMapper();
    //    logger.info("调用接口开始...");
    //    logger.info("调用参数为：【{}】",request);
    //    String jsonStr = doPost("http://134.95.237.10:8976/QtyInformation/service/qtyInforservice/get_linux_account/0?seq=1",request,300*1000);
    //    JsonNode qty = mapper.readTree(jsonStr);
    //    JsonNode rows = qty.get("rows");
    //
    //    List<UserAccountInfo> userList = new ArrayList<>();
    //    if(!rows.isNull()) {
    //        for (int i = 0; i < rows.size(); i++) {
    //            JsonNode row = rows.get(i);
    //            UserAccountInfo user = new UserAccountInfo();
    //            user.setGroups(row.get("groups").asText());
    //            user.setName(row.get("name").asText());
    //            user.setStatus(row.get("status").asInt());
    //            user.setHome(row.get("home").asText());
    //            user.setLastLoginTime(row.get("lastLoginTime").asText());
    //            user.setLastLoginIp(row.get("lastLoginTime").asText());
    //            userList.add(user);
    //        }
    //    }
    //    jsonObject.put("total",userList.size());
    //    jsonObject.put("data",userList);
    //    return new JsonResponse(new JsonResult(jsonObject));
    //}

    ///**
    // * 根据ip查询青藤云进程相关信息
    // * @param object
    // * @return
    // * @throws Exception
    // */
    //@ServiceMethodInfo(authentincation = false)
    //public IDataResponse getProcessInfo(JsonObject object) throws Exception {
    //    JsonObject jsonObject = new JsonObject();
    //    //入参校验
    //    Map<String, Object> map = PageUtils.checkPageParams(object.toMap());
    //    //调用青藤云接口
    //    JsonObject request = new JsonObject();
    //    request.put("ip",object.get("ip"));
    //    ObjectMapper mapper = new ObjectMapper();
    //    logger.info("调用接口开始...");
    //    logger.info("调用参数为：【{}】",request);
    //    String jsonStr = doPost("http://134.95.237.10:8976/QtyInformation/service/qtyInforservice/get_linux_process/0",request,300*1000);
    //    JsonNode qty = mapper.readTree(jsonStr);
    //    JsonNode rows = qty.get("rows");
    //
    //    List<ProcessInfo> processInfoList = new ArrayList<>();
    //    if(!rows.isNull()) {
    //        for (int i = 0; i < rows.size(); i++) {
    //            ProcessInfo processInfo = new ProcessInfo();
    //            JsonNode row = rows.get(i);
    //            processInfo.setState(row.get("state").asText());
    //            processInfo.setGname(row.get("gname").asText());
    //            processInfo.setUname(row.get("uname").asText());
    //            processInfo.setPid(row.get("pid").asInt());
    //            processInfo.setPpid(row.get("ppid").asInt());
    //            processInfo.setPath(row.get("path").asText());
    //            processInfo.setStartArgs(row.get("startArgs").asText());
    //            processInfo.setStartTime(row.get("startTime").asText());
    //            processInfo.setRoot(row.get("root").asBoolean()?1:0);
    //            processInfoList.add(processInfo);
    //        }
    //    }
    //    jsonObject.put("total",processInfoList.size());
    //    jsonObject.put("data",processInfoList);
    //    return new JsonResponse(new JsonResult(jsonObject));
    //}


    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getUserAccountInfo(JsonObject object) throws Exception {
        JsonObject jsonObject = new JsonObject();
        //入参校验
        Map<String, Object> map = PageUtils.checkPageParams(object.toMap());
        List<AccountInfor> accountInforList = intfSocJixianMapper.getUserAccountInfo(map.get("ip").toString());
        List<UserAccountInfo> list = new ArrayList<>();
        for(AccountInfor a : accountInforList) {
            UserAccountInfo userAccountInfo = new UserAccountInfo();
            userAccountInfo.setGroups(a.getGroups());
            userAccountInfo.setName(a.getName());
            userAccountInfo.setStatus(a.getStatus());
            userAccountInfo.setHome(a.getHome());
            userAccountInfo.setLastLoginTime(a.getLastLoginTime());
            userAccountInfo.setLastLoginIp(a.getLastLoginIp());
            list.add(userAccountInfo);
        }
        jsonObject.put("total",list.size());
        jsonObject.put("data",list);
        return new JsonResponse(new JsonResult(jsonObject));
    }

    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getProcessInfo(JsonObject object) throws Exception {
        JsonObject jsonObject = new JsonObject();
        //入参校验
        Map<String, Object> map = PageUtils.checkPageParams(object.toMap());
        List<ProcessInfor> processInfoList = intfSocJixianMapper.getProcessInfo(map.get("ip").toString());
        List<ProcessInfo> list = new ArrayList<>();
        for(ProcessInfor p : processInfoList) {
            ProcessInfo processInfo = new ProcessInfo();
            processInfo.setState(p.getState());
            processInfo.setGname(p.getGname());
            processInfo.setUname(p.getUname());
            processInfo.setPid(p.getPid());
            processInfo.setPpid(Integer.valueOf(p.getPpid()));
            processInfo.setPath(p.getPath());
            processInfo.setStartArgs(p.getStartArgs());
            processInfo.setStartTime(p.getStartTime());
            processInfo.setRoot("true".equals(p.getRoot())?1:0);
            list.add(processInfo);
        }
        jsonObject.put("total",list.size());
        jsonObject.put("data",list);
        return new JsonResponse(new JsonResult(jsonObject));
    }

    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getTsMessageAllInfo() throws Exception {
        JsonObject object = new JsonObject();
        //查询昨天的所有攻击数
        long lastOneDayAllCount = tsMessageMapper.lastOneDayAllCount();
        object.put("lastOneDayAllCount",lastOneDayAllCount);
        return new JsonResponse(new JsonResult(object));
    }

    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getTsMessageInfo(String deptId) throws Exception {
        JsonObject object = new JsonObject();
        //查询某个部门昨天的受攻击数
        Long oneDayDeptCount = tsMessageMapper.lastOneDayDeptCount(deptId);
        //查询某个部门前天的受攻击数
        Long twoDayDeptCount = tsMessageMapper.lastTwoDayDeptCount(deptId);

        object.put("oneDayDeptCount",oneDayDeptCount);
        object.put("twoDayDeptCount",twoDayDeptCount);
        return new JsonResponse(new JsonResult(object));
    }

    @ServiceMethodInfo(authentincation = false)
    public IDataResponse testJava(String name) {
        if(StringUtils.isNotEmpty(name)){
            System.out.println("5666666");
        }
        if("aaa".contains(name)){
            System.out.println("1111");
        }
        return new JsonResponse(new JsonResult());
    }



        private String[] getIpSplit(String ip){
        WebContextHolder.getLoginUserInfo();
      return  ip.split(",");
    }

    /**
     * 基线的日期格式转换
     * @param date
     * @return
     */
    private String dateTransport(String date) {
        date = date.replace("th","");
        SimpleDateFormat srcFormat = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss", Locale.ENGLISH);
        SimpleDateFormat destFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = null;
        try {
            parse = srcFormat.parse(date);
        } catch (ParseException e) {
            logger.error("日期格式转换失败!",new RuntimeException("日期格式转换失败!"));
        }
        return destFormat.format(parse);
    }

    //调用青藤云接口
    private String doPost(String url, JsonObject params, Integer timeout) throws SocketTimeoutException {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        String result = null;
        try {
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(timeout).setConnectTimeout(timeout)
                    .setConnectionRequestTimeout(timeout).build();
            httpClient = HttpClients.createDefault();

            HttpPost post = new HttpPost(url);
            post.setConfig(requestConfig);
            // TODO contentType改为application/x-www-form-urlencoded 就能调用interface传参了
            post.setHeader("Content-Type", "application/json");
            post.setEntity(new StringEntity(params.toString(), "UTF-8"));
            response = httpClient.execute(post);
            result = EntityUtils.toString(response.getEntity(), "UTF-8");
        } catch (SocketTimeoutException e) {
            throw e;
        } catch (Exception e) {
            result = "{\"RESULTCODE\": \"1111\",\"RESULTDESC\": \"调用接口超时\"}";
            logger.error("调用接口失败...", e);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
        return result;
    }

    @Override
    public String getCode() {
        return "intfSocService";
    }

    @Override
    public String getName() {
        return "定级系统";
    }
}
