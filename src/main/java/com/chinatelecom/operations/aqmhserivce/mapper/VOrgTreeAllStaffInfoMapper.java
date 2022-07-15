package com.chinatelecom.operations.aqmhserivce.mapper;

import com.chinatelecom.operations.aqmhserivce.entity.VOrgTreeAllStaffInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author SunHu
 * @since 2022-05-27
 */
public interface VOrgTreeAllStaffInfoMapper extends BaseMapper<VOrgTreeAllStaffInfo> {


    int getStaffCount(String orgName);

    List<Map<String,String>> getStaffKindAndNum();

}
