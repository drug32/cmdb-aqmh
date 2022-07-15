package com.chinatelecom.operations.aqmhserivce.mapper;

import com.chinatelecom.operations.aqmhserivce.entity.IntfTsgzAlarm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Set;

/**
 * <p>
 * intf_tsgz_alarm Mapper 接口
 * </p>
 *
 * @author SunHu
 * @since 2022-06-17
 */
public interface IntfTsgzAlarmMapper extends BaseMapper<IntfTsgzAlarm> {
          int getTsCount(Set<String> set);
}
