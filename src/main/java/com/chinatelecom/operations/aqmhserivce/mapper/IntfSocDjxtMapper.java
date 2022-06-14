package com.chinatelecom.operations.aqmhserivce.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinatelecom.operations.aqmhserivce.entity.IntfSocDjxt;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.GetLoginTimes;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.OrgMachineNum;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 孙虎
 */
@Repository
public interface IntfSocDjxtMapper extends BaseMapper<IntfSocDjxt> {
    /**
     * 查询当前系统的登录次数
     */
      List<GetLoginTimes> getLoginTimes(String targetClientId);

      List<OrgMachineNum> getOrgMachineNum();
}
