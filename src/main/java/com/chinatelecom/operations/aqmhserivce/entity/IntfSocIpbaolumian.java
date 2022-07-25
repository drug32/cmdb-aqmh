package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author SunHu
 * @since 2022-05-31
 */
@EqualsAndHashCode(callSuper = false)
@TableName("intf_soc_ipbaolumian")
public class IntfSocIpbaolumian implements Serializable {


    @TableField("netequip_id")
    private String netequipId;

    @TableField("network_name")
    private String networkName;

    private String ip;

    @TableField("system_id")
    private String systemId;

    @TableField("deptment_name")
    private String deptmentName;

    @TableField("syslevel_name")
    private String syslevelName;

    @TableField("to_level")
    private String toLevel;

    @TableField("if_update")
    private String ifUpdate;

    @TableField("itsm_name")
    private String itsmName;

    @TableField("fourasys_name")
    private String fourasysName;

    @TableField("create_time")
    private String createTime;

    @TableField("update_time")
    private String updateTime;

    @TableField("is_delete")
    private String isDelete;

    @TableField("company_name")
    private String companyName;

    private String creater;

    private String port;

    @TableField("open_service")
    private String openService;

    @TableField("open_range")
    private String openRange;

    @TableField("if_use")
    private String ifUse;

    @TableField("open__purpose")
    private String openPurpose;

    @TableField("to_object")
    private String toObject;

    private String owner;

    public String getNetequipId() {
        return netequipId;
    }

    public void setNetequipId(String netequipId) {
        this.netequipId = netequipId;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getDeptmentName() {
        return deptmentName;
    }

    public void setDeptmentName(String deptmentName) {
        this.deptmentName = deptmentName;
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

    public String getItsmName() {
        return itsmName;
    }

    public void setItsmName(String itsmName) {
        this.itsmName = itsmName;
    }

    public String getFourasysName() {
        return fourasysName;
    }

    public void setFourasysName(String fourasysName) {
        this.fourasysName = fourasysName;
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

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getOpenService() {
        return openService;
    }

    public void setOpenService(String openService) {
        this.openService = openService;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
