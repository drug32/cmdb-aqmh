package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 孙虎
 */
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

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getDeptment() {
        return deptment;
    }

    public void setDeptment(String deptment) {
        this.deptment = deptment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSyslevelName() {
        return syslevelName;
    }

    public void setSyslevelName(String syslevelName) {
        this.syslevelName = syslevelName;
    }

    public String getToLevel() {
        return toLevel;
    }

    public void setToLevel(String toLevel) {
        this.toLevel = toLevel;
    }

    public String getIfUpdate() {
        return ifUpdate;
    }

    public void setIfUpdate(String ifUpdate) {
        this.ifUpdate = ifUpdate;
    }

    public String getIfTysystem() {
        return ifTysystem;
    }

    public void setIfTysystem(String ifTysystem) {
        this.ifTysystem = ifTysystem;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getOutNo() {
        return outNo;
    }

    public void setOutNo(String outNo) {
        this.outNo = outNo;
    }

    public String getOutNetname() {
        return outNetname;
    }

    public void setOutNetname(String outNetname) {
        this.outNetname = outNetname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getOpenRange() {
        return openRange;
    }

    public void setOpenRange(String openRange) {
        this.openRange = openRange;
    }

    public String getIfUse() {
        return ifUse;
    }

    public void setIfUse(String ifUse) {
        this.ifUse = ifUse;
    }

    public String getOpenPurpose() {
        return openPurpose;
    }

    public void setOpenPurpose(String openPurpose) {
        this.openPurpose = openPurpose;
    }

    public String getToObject() {
        return toObject;
    }

    public void setToObject(String toObject) {
        this.toObject = toObject;
    }

    public String getOpenService() {
        return openService;
    }

    public void setOpenService(String openService) {
        this.openService = openService;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
