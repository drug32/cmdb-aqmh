package com.chinatelecom.operations.aqmhserivce.mapper;

import com.chinatelecom.operations.aqmhserivce.entity.IntfSocIpbaolumian;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.DeptIpBaoLuMian;


import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author SunHu
 * @since 2022-05-31
 */
public interface IntfSocIpbaolumianMapper extends BaseMapper<IntfSocIpbaolumian> {


    int getDeptIpBaoLuMian(String deptId);
    List<DeptIpBaoLuMian> getDeptIpBaoLuMianAll();


}
