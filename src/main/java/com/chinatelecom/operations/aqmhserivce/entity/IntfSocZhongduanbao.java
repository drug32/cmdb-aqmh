package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
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
 * @since 2022-05-25
 */
@EqualsAndHashCode(callSuper = false)
@TableName("intf_soc_zhongduanbao")
public class IntfSocZhongduanbao implements Serializable {


    @TableField("device_id")
    private String deviceId;

    @TableField("device_name")
    private String deviceName;

    @TableField("system_id")
    private String systemId;

    @TableField("deptment_name")
    private String deptmentName;

    private String owner;

    @TableField("syslevel_name")
    private String syslevelName;

    private String ip;

    private String port;

    @TableField("open_service")
    private String openService;

    @TableField("open_range")
    private String openRange;

    @TableField("if_use")
    private String ifUse;

    @TableField("open_purpose")
    private String openPurpose;

    @TableField("to_object")
    private String toObject;

    @TableField("to_level")
    private String toLevel;

    @TableField("if_update")
    private String ifUpdate;

    @TableField("into_plat")
    private String intoPlat;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private String createTime;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private String updateTime;

    @TableField("is_delete")
    private String isDelete;

    @TableField("company_name")
    private String companyName;

    private String creater;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSyslevelName() {
        return syslevelName;
    }

    public void setSyslevelName(String syslevelName) {
        this.syslevelName = syslevelName;
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

    public String getIntoPlat() {
        return intoPlat;
    }

    public void setIntoPlat(String intoPlat) {
        this.intoPlat = intoPlat;
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
}
