package com.chinatelecom.operations.aqmhserivce.reqservice;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chinatelecom.operations.aqmhserivce.entity.*;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.DeptIpBaoLuMian;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.GetLoginTimes;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.OrgMachineNum;
import com.chinatelecom.operations.aqmhserivce.mapper.IntfSocDjxtMapper;
import com.chinatelecom.operations.aqmhserivce.mapper.IntfSocIpbaolumianMapper;
import com.chinatelecom.operations.aqmhserivce.mapper.VOrgTreeAllStaffInfoMapper;
import com.chinatelecom.operations.aqmhserivce.service.*;
import com.chinatelecom.operations.aqmhserivce.utils.*;
import com.chinatelecom.udp.core.datarouter.IDataResponse;
import com.chinatelecom.udp.core.datarouter.IWorkService;
import com.chinatelecom.udp.core.datarouter.ServiceMethodInfo;
import com.chinatelecom.udp.core.datarouter.exception.DataException;
import com.chinatelecom.udp.core.datarouter.response.JSONResponse;
import com.chinatelecom.udp.core.lang.json.JSONArray;
import com.chinatelecom.udp.core.lang.json.JSONObject;
import org.apache.bcel.generic.NEW;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component; 
import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



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

    /** @Author 孙虎
     * @Description //获取某个系统的相关信息
     * @date 9:45 2022/5/31
     * @Param [sysId]
     * @return com.chinatelecom.udp.core.datarouter.IDataResponse
     **/
    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getSystemInfo(String sysId) throws DataException, IOException, SQLException {
        logger.info("=================>获取系统的相关信息,getSystemInfo方法入参sysId为：" +sysId);
        if(StringUtils.isEmpty(sysId)){
            return new JSONResponse(new JsonResult("系统ID不能为空",false));
        }
        JSONObject object = new JSONObject();
        List<IntfSocDjxt> intfSocDjxtList = intfSocDjxtService.list(new QueryWrapper<IntfSocDjxt>().eq("id", sysId));
        IntfSocDjxt intfSocDjxt = intfSocDjxtList.get(0);
        //查询出指定业务系统的应用程序资产
        long countForApp = intfSocItZichanService.count(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId).likeRight("category", "4"));
        //查询出指定业务系统的数据库资产
        long countForDB = intfSocItZichanService.count(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId).likeRight("category", "403"));
        //查询出指定业务系统的主机资产
        long countForMachine = intfSocItZichanService.count(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId).likeRight("category", "1"));
        List<IntfSocItzichan> itZiChanList = intfSocItZichanService.list(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId));
        List<String> assetIdList = itZiChanList.stream().map(IntfSocItzichan::getAssetId).collect(Collectors.toList());
        //获取该系统的登录次数以及各种类型的员工的登录次数
        List<GetLoginTimes> LoginTimesList = intfSocDjxtMapper.getLoginTimes("CTAHMSSOA20130002");
        //查询出指定业务系统的系统暴露面
        long countForXitongbaolumian = intfSocXitongbaolumianService.count(new QueryWrapper<IntfSocXitongbaolumian>().eq("system_id", sysId));
        if(countForXitongbaolumian>0){
            object.put("xitongbaolumian",countForXitongbaolumian);
        }
        object.put("name", intfSocDjxt.getName());
        object.put("baName", intfSocDjxt.getBusinessnameLevel());
        object.put("chengXu", countForApp);
        object.put("shuJuKu", countForDB);
        object.put("zhuJi", countForMachine);
        object.put("loginTimes", LoginTimesList);
        return new JSONResponse(new JsonResult(object));
    }


    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getSystemInfoList(String orgId) throws DataException, IOException, SQLException {
        List<IntfSocDjxt> list = intfSocDjxtService.list(new QueryWrapper<IntfSocDjxt>().eq("company_id",orgId));
        return new JSONResponse(new JsonResult(list));
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
        // 设置精确到小数点后2位
        numberFormat.setMaximumFractionDigits(2);
        String result = numberFormat.format((float) jiXianSuccess / (float) jiXianAll * 100).concat("%");
        List<Map<String, String>> staffKindAndNumMap = vOrgTreeAllStaffInfoMapper.getStaffKindAndNum();
        JSONObject object = new JSONObject();
        object.put("deptList", list);
        object.put("staffCount",staffCount);
        object.put("orgMachineNumList",orgMachineNumList);
        object.put("jiXianSucuessRate", result);
        object.put("staffInfo", staffKindAndNumMap);
        return new JSONResponse(new JsonResult(object));
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
        JSONObject object = new JSONObject();
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
        return new JSONResponse(new JsonResult(object));
    }

    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getItZichanList(JSONObject object) throws Exception {
        //入参校验
        Map<String, Object> map = PageUtils.checkPageParams(object.toMap());
        if (!map.containsKey(Constant.SYS_ID)) {
            return new JSONResponse(new JsonResult("系统ID为空，请检查", false));
        }
        //分页查询
        IPage<IntfSocItzichan> page = intfSocItZichanService.page(new Query<IntfSocItzichan>().getPage(map),
                new QueryWrapper<IntfSocItzichan>()
                        .eq(map.get(Constant.SYS_ID) != null, "asset_group_id", map.get(Constant.SYS_ID))
                        .like(StringUtils.isNotBlank((String) map.get("kind")), "category", map.get("kind")));
        JSONObject dataFromPage = PageUtils.getDataFromPage(new PageUtils(page));
        JSONArray array =(JSONArray)dataFromPage.get("list");
        List<IntfSocItzichan> intfSocItzichanList =new ArrayList<>();
        ArrayList<JSONObject> itZiChanList = array.toList(JSONObject.class);
        for (JSONObject jsonObject : itZiChanList) {
            IntfSocItzichan itZichanEntity = jsonObject.toBean(IntfSocItzichan.class);
        }
        return new JSONResponse(new JsonResult(dataFromPage));
    }


    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getIpBaoLuMian() throws Exception {
        JSONObject object = new JSONObject();
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
        return new JSONResponse(new JsonResult(object));
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
