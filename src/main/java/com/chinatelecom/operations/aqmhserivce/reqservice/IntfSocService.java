package com.chinatelecom.operations.aqmhserivce.reqservice;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chinatelecom.operations.aqmhserivce.entity.IntfSocDjxt;
import com.chinatelecom.operations.aqmhserivce.entity.IntfSocItzichan;
import com.chinatelecom.operations.aqmhserivce.entity.IntfSocXitongbaolumian;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.GetLoginTimes;
import com.chinatelecom.operations.aqmhserivce.mapper.IntfSocDjxtMapper;
import com.chinatelecom.operations.aqmhserivce.service.EmpeeAcctInfoService;
import com.chinatelecom.operations.aqmhserivce.service.IntfSocItZichanService;
import com.chinatelecom.operations.aqmhserivce.service.IntfSocJixianService;
import com.chinatelecom.operations.aqmhserivce.service.IntfSocXitongbaolumianService;
import com.chinatelecom.operations.aqmhserivce.utils.Constant;
import com.chinatelecom.operations.aqmhserivce.utils.JsonResult;
import com.chinatelecom.operations.aqmhserivce.utils.PageUtils;
import com.chinatelecom.operations.aqmhserivce.utils.Query;
import com.chinatelecom.udp.core.datarouter.IDataResponse;
import com.chinatelecom.udp.core.datarouter.IWorkService;
import com.chinatelecom.udp.core.datarouter.ServiceMethodInfo;
import com.chinatelecom.udp.core.datarouter.exception.DataException;
import com.chinatelecom.udp.core.datarouter.response.JSONResponse;
import com.chinatelecom.udp.core.lang.json.JSONArray;
import com.chinatelecom.udp.core.lang.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class IntfSocService implements IWorkService {

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
    private IntfSocDjxtMapper intfSocDjxtMapper;

    @ServiceMethodInfo(authentincation = false)
    public IDataResponse getSystemInfo(String sysId) throws DataException, IOException, SQLException {
        JSONObject object = new JSONObject();
        List<IntfSocDjxt> intfSocDjxtList = intfSocDjxtService.list(new QueryWrapper<IntfSocDjxt>().eq("id", sysId));
        IntfSocDjxt intfSocDjxt = intfSocDjxtList.get(0);
        //查询出指定业务系统的应用程序资产
        long countForApp = intfSocItZichanService.count(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId).like("category", "4"));
        //查询出指定业务系统的数据库资产
        long countForDB = intfSocItZichanService.count(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId).like("category", "403"));
        //查询出指定业务系统的主机资产
        long countForMachine = intfSocItZichanService.count(new QueryWrapper<IntfSocItzichan>().eq("asset_group_id", sysId).like("category", "1"));
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
    public IDataResponse getSystemInfoList() throws DataException, IOException, SQLException {
        List<IntfSocDjxt> list = intfSocDjxtService.list();
        return new JSONResponse(new JsonResult(list));
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

    @Override
    public String getCode() {
        return "intfSocService";
    }

    @Override
    public String getName() {
        return "定级系统";
    }
}
