package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("intf_soc_djxt")
public class IntfSocDjxt {
    private String id;
    private String name;
    private String major;
    private String companyId;
    private String deptId;
    private String areaId;
    private String ownerA;
    private String ownerB;
    private String publicIp;
    private String dcnIp;
    private String cn2Ip;
    private String privateIp;
    private String businessnameLevel;
}