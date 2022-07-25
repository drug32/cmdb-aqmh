package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getOwnerA() {
        return ownerA;
    }

    public void setOwnerA(String ownerA) {
        this.ownerA = ownerA;
    }

    public String getOwnerB() {
        return ownerB;
    }

    public void setOwnerB(String ownerB) {
        this.ownerB = ownerB;
    }

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public String getDcnIp() {
        return dcnIp;
    }

    public void setDcnIp(String dcnIp) {
        this.dcnIp = dcnIp;
    }

    public String getCn2Ip() {
        return cn2Ip;
    }

    public void setCn2Ip(String cn2Ip) {
        this.cn2Ip = cn2Ip;
    }

    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public String getBusinessnameLevel() {
        return businessnameLevel;
    }

    public void setBusinessnameLevel(String businessnameLevel) {
        this.businessnameLevel = businessnameLevel;
    }
}