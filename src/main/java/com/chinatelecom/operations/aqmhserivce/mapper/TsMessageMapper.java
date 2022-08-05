package com.chinatelecom.operations.aqmhserivce.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinatelecom.operations.aqmhserivce.entity.TsMessage;
import org.springframework.stereotype.Repository;

/**
 * @Author: Wang
 * @Date: 2022/8/4 15:38
 * @Description:
 */
@Repository
public interface TsMessageMapper extends BaseMapper<TsMessage> {

    /**
     * 查询昨天的所有攻击数量
     * @return
     */
    Long lastOneDayAllCount();

    /**
     * 查询某个部门昨天受攻击的数量
     * @return
     */
    Long lastOneDayDeptCount(String deptId);

    /**
     * 查询某个部门前天受攻击的数量
     * @return
     */
    Long lastTwoDayDeptCount(String deptId);

}
