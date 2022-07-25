package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("intf_soc_itzichan")
public class IntfSocItzichan {
    private String assetId;
    private String assetName;
    private String areaId;
    private String orgId;
    private String deptOrgId;
    private String specialityId;
    private String assetGroupId;
    private String assetGroup;
    private String assetRole;
    private String assetDescription;
    private String respUserName;
    private String respUseraPhone;
    private String userbName;
    private String respUserbName;
    private String state;
    private String keyLevel;
    private String pkeyLevel;
    private String assetClass;
    private String mgmtProtocol;
    private String manuFacturer;
    private String category;
    private String modelNumber;
    private String osType;
    private String osVersion;
    private String superAssetId;
    private String updateTime;
    private String collway;
    private String ifScan;
    private String mgmtIp;
    private String publicIp;
    private String dcnIp;
    private String cn2Ip;
    private String privateIp;
    private String floatingIp;
    private String hostMappingIp;
    private String dcnManualIp;
    private String pubManualIp;
    private String subCategory;
    private String agentInfo;
    private String antivirusProperty;
    private String patchProperty;
    private String business;
    private String hostPort;
    private String processList;
    private String hostList;
    private String holesAttribute;
    private String logProperty;
    private String accountPasswordPolicy;
    private String startupConfiguration;
    private String osConfiguration;
    private String virtualMachineSystem;
    private String databaseName;
    private String databaseVersion;
    private String databasePort;
    private String middlewareName;
    private String middlewareVersion;
    private String middlewarePort;
    private String appName;
    private String appVersion;
    private String appPort;
    private String webAccessUrl;

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getDeptOrgId() {
        return deptOrgId;
    }

    public void setDeptOrgId(String deptOrgId) {
        this.deptOrgId = deptOrgId;
    }

    public String getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId;
    }

    public String getAssetGroupId() {
        return assetGroupId;
    }

    public void setAssetGroupId(String assetGroupId) {
        this.assetGroupId = assetGroupId;
    }

    public String getAssetGroup() {
        return assetGroup;
    }

    public void setAssetGroup(String assetGroup) {
        this.assetGroup = assetGroup;
    }

    public String getAssetRole() {
        return assetRole;
    }

    public void setAssetRole(String assetRole) {
        this.assetRole = assetRole;
    }

    public String getAssetDescription() {
        return assetDescription;
    }

    public void setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
    }

    public String getRespUserName() {
        return respUserName;
    }

    public void setRespUserName(String respUserName) {
        this.respUserName = respUserName;
    }

    public String getRespUseraPhone() {
        return respUseraPhone;
    }

    public void setRespUseraPhone(String respUseraPhone) {
        this.respUseraPhone = respUseraPhone;
    }

    public String getUserbName() {
        return userbName;
    }

    public void setUserbName(String userbName) {
        this.userbName = userbName;
    }

    public String getRespUserbName() {
        return respUserbName;
    }

    public void setRespUserbName(String respUserbName) {
        this.respUserbName = respUserbName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getKeyLevel() {
        return keyLevel;
    }

    public void setKeyLevel(String keyLevel) {
        this.keyLevel = keyLevel;
    }

    public String getPkeyLevel() {
        return pkeyLevel;
    }

    public void setPkeyLevel(String pkeyLevel) {
        this.pkeyLevel = pkeyLevel;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public String getMgmtProtocol() {
        return mgmtProtocol;
    }

    public void setMgmtProtocol(String mgmtProtocol) {
        this.mgmtProtocol = mgmtProtocol;
    }

    public String getManuFacturer() {
        return manuFacturer;
    }

    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getSuperAssetId() {
        return superAssetId;
    }

    public void setSuperAssetId(String superAssetId) {
        this.superAssetId = superAssetId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCollway() {
        return collway;
    }

    public void setCollway(String collway) {
        this.collway = collway;
    }

    public String getIfScan() {
        return ifScan;
    }

    public void setIfScan(String ifScan) {
        this.ifScan = ifScan;
    }

    public String getMgmtIp() {
        return mgmtIp;
    }

    public void setMgmtIp(String mgmtIp) {
        this.mgmtIp = mgmtIp;
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

    public String getFloatingIp() {
        return floatingIp;
    }

    public void setFloatingIp(String floatingIp) {
        this.floatingIp = floatingIp;
    }

    public String getHostMappingIp() {
        return hostMappingIp;
    }

    public void setHostMappingIp(String hostMappingIp) {
        this.hostMappingIp = hostMappingIp;
    }

    public String getDcnManualIp() {
        return dcnManualIp;
    }

    public void setDcnManualIp(String dcnManualIp) {
        this.dcnManualIp = dcnManualIp;
    }

    public String getPubManualIp() {
        return pubManualIp;
    }

    public void setPubManualIp(String pubManualIp) {
        this.pubManualIp = pubManualIp;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getAgentInfo() {
        return agentInfo;
    }

    public void setAgentInfo(String agentInfo) {
        this.agentInfo = agentInfo;
    }

    public String getAntivirusProperty() {
        return antivirusProperty;
    }

    public void setAntivirusProperty(String antivirusProperty) {
        this.antivirusProperty = antivirusProperty;
    }

    public String getPatchProperty() {
        return patchProperty;
    }

    public void setPatchProperty(String patchProperty) {
        this.patchProperty = patchProperty;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public String getProcessList() {
        return processList;
    }

    public void setProcessList(String processList) {
        this.processList = processList;
    }

    public String getHostList() {
        return hostList;
    }

    public void setHostList(String hostList) {
        this.hostList = hostList;
    }

    public String getHolesAttribute() {
        return holesAttribute;
    }

    public void setHolesAttribute(String holesAttribute) {
        this.holesAttribute = holesAttribute;
    }

    public String getLogProperty() {
        return logProperty;
    }

    public void setLogProperty(String logProperty) {
        this.logProperty = logProperty;
    }

    public String getAccountPasswordPolicy() {
        return accountPasswordPolicy;
    }

    public void setAccountPasswordPolicy(String accountPasswordPolicy) {
        this.accountPasswordPolicy = accountPasswordPolicy;
    }

    public String getStartupConfiguration() {
        return startupConfiguration;
    }

    public void setStartupConfiguration(String startupConfiguration) {
        this.startupConfiguration = startupConfiguration;
    }

    public String getOsConfiguration() {
        return osConfiguration;
    }

    public void setOsConfiguration(String osConfiguration) {
        this.osConfiguration = osConfiguration;
    }

    public String getVirtualMachineSystem() {
        return virtualMachineSystem;
    }

    public void setVirtualMachineSystem(String virtualMachineSystem) {
        this.virtualMachineSystem = virtualMachineSystem;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseVersion() {
        return databaseVersion;
    }

    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    public String getDatabasePort() {
        return databasePort;
    }

    public void setDatabasePort(String databasePort) {
        this.databasePort = databasePort;
    }

    public String getMiddlewareName() {
        return middlewareName;
    }

    public void setMiddlewareName(String middlewareName) {
        this.middlewareName = middlewareName;
    }

    public String getMiddlewareVersion() {
        return middlewareVersion;
    }

    public void setMiddlewareVersion(String middlewareVersion) {
        this.middlewareVersion = middlewareVersion;
    }

    public String getMiddlewarePort() {
        return middlewarePort;
    }

    public void setMiddlewarePort(String middlewarePort) {
        this.middlewarePort = middlewarePort;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppPort() {
        return appPort;
    }

    public void setAppPort(String appPort) {
        this.appPort = appPort;
    }

    public String getWebAccessUrl() {
        return webAccessUrl;
    }

    public void setWebAccessUrl(String webAccessUrl) {
        this.webAccessUrl = webAccessUrl;
    }
}
