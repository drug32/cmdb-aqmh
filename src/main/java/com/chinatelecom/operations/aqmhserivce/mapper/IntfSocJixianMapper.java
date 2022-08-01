package com.chinatelecom.operations.aqmhserivce.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinatelecom.operations.aqmhserivce.entity.AccountInfor;
import com.chinatelecom.operations.aqmhserivce.entity.IntfSocJixian;
import com.chinatelecom.operations.aqmhserivce.entity.ProcessInfor;
import com.chinatelecom.operations.aqmhserivce.entity.mbresultentity.UserAccountInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 孙虎
 */
@Repository
public interface IntfSocJixianMapper extends BaseMapper<IntfSocJixian> {

    /**
     * 根据ip地址查询对应资产的asset_id的基线检查总量
     * @param ip
     * @return
     */
    Long getAllAssetCount(String ip);


    /**
     * 根据ip地址查询对应资产的asset_id的基线检查通过或不通过量
     * @param ip
     * @param passNum
     * @return
     */
    Long getCount(String ip,String passNum);

    /**
     * 根据ip地址查询对应资产的asset_id的基线检查不合格量
     * @param ip
     * @return
     */
    List<IntfSocJixian> noPassList(String ip);


    /**
     * 根据ip地址查询账户信息
     * @param ip
     * @return
     */
    List<AccountInfor> getUserAccountInfo(String ip);

    /**
     * 根据ip地址查询进程信息
     * @param ip
     * @return
     */
    List<ProcessInfor> getProcessInfo(String ip);
}
