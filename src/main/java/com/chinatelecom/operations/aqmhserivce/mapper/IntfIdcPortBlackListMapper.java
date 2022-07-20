package com.chinatelecom.operations.aqmhserivce.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinatelecom.operations.aqmhserivce.entity.IntfIdcPortBlackList;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.GetLoginTimes;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.GroupByCityCodeCount;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.OrgMachineNum;

import java.util.List;

/**
 * @Author: Wang
 * @Date: 2022/7/19 15:39
 * @Description:
 */
public interface IntfIdcPortBlackListMapper extends BaseMapper<IntfIdcPortBlackList> {

    /**
     * 根据citycode分组展示总数，并增排序
     * @return Long
     */
    List<GroupByCityCodeCount> getCountByCityCode();
}
