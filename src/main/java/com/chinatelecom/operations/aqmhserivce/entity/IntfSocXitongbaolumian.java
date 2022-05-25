package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 孙虎
 */
@Data
@TableName("intf_soc_xitongbaolumian")
public class IntfSocXitongbaolumian {
    private String sysId;
    private String systemId;
    private String deptment;
    private String username;
    private String syslevelName;
    private String toLevel;
    private String ifUpdate;
    private String ifTysystem;
    private String createTime;
    private String updateTime;
    private String isDelete;
    private String companyName;
    private String creater;
    private String outNo;
    private String outNetname;
    private String ip;
    private String port;
    private String domainName;
    private String openRange;
    private String ifUse;
    private String openPurpose;
    private String toObject;
    private String openService;
    private String owner;
}
