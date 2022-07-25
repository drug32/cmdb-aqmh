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
 * @since 2022-05-25
 */
@EqualsAndHashCode(callSuper = false)
@TableName("intf_soc_ipzichan")
public class IntfSocIpzichan implements Serializable {


    @TableField("asset_id")
    private String assetId;

    private String state;

    @TableField("business_id")
    private String businessId;

    @TableField("business_name")
    private String businessName;

    private String company;

    @TableField("company_id")
    private String companyId;

    @TableField("area_id")
    private String areaId;

    private String department;

    @TableField("dept_id")
    private String deptId;

    private String professional;

    @TableField("category_id")
    private String categoryId;

    private String manufacturer;

    @TableField("model_number")
    private String modelNumber;

    @TableField("os_version")
    private String osVersion;

    @TableField("master_ip")
    private String masterIp;

    @TableField("public_ipv4")
    private String publicIpv4;

    @TableField("cn2_ipv4")
    private String cn2Ipv4;

    @TableField("dcn_ipv4")
    private String dcnIpv4;

    @TableField("floating_ipv4")
    private String floatingIpv4;

    @TableField("private_ipv4")
    private String privateIpv4;

    @TableField("public_ipv6")
    private String publicIpv6;

    @TableField("cn2_ipv6")
    private String cn2Ipv6;

    @TableField("dcn_ipv6")
    private String dcnIpv6;

    @TableField("floating_ipv6")
    private String floatingIpv6;

    @TableField("private_ipv6")
    private String privateIpv6;

    private String responsibility;

    @TableField("responsibility_contact")
    private String responsibilityContact;

    private String info;

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getMasterIp() {
        return masterIp;
    }

    public void setMasterIp(String masterIp) {
        this.masterIp = masterIp;
    }

    public String getPublicIpv4() {
        return publicIpv4;
    }

    public void setPublicIpv4(String publicIpv4) {
        this.publicIpv4 = publicIpv4;
    }

    public String getCn2Ipv4() {
        return cn2Ipv4;
    }

    public void setCn2Ipv4(String cn2Ipv4) {
        this.cn2Ipv4 = cn2Ipv4;
    }

    public String getDcnIpv4() {
        return dcnIpv4;
    }

    public void setDcnIpv4(String dcnIpv4) {
        this.dcnIpv4 = dcnIpv4;
    }

    public String getFloatingIpv4() {
        return floatingIpv4;
    }

    public void setFloatingIpv4(String floatingIpv4) {
        this.floatingIpv4 = floatingIpv4;
    }

    public String getPrivateIpv4() {
        return privateIpv4;
    }

    public void setPrivateIpv4(String privateIpv4) {
        this.privateIpv4 = privateIpv4;
    }

    public String getPublicIpv6() {
        return publicIpv6;
    }

    public void setPublicIpv6(String publicIpv6) {
        this.publicIpv6 = publicIpv6;
    }

    public String getCn2Ipv6() {
        return cn2Ipv6;
    }

    public void setCn2Ipv6(String cn2Ipv6) {
        this.cn2Ipv6 = cn2Ipv6;
    }

    public String getDcnIpv6() {
        return dcnIpv6;
    }

    public void setDcnIpv6(String dcnIpv6) {
        this.dcnIpv6 = dcnIpv6;
    }

    public String getFloatingIpv6() {
        return floatingIpv6;
    }

    public void setFloatingIpv6(String floatingIpv6) {
        this.floatingIpv6 = floatingIpv6;
    }

    public String getPrivateIpv6() {
        return privateIpv6;
    }

    public void setPrivateIpv6(String privateIpv6) {
        this.privateIpv6 = privateIpv6;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getResponsibilityContact() {
        return responsibilityContact;
    }

    public void setResponsibilityContact(String responsibilityContact) {
        this.responsibilityContact = responsibilityContact;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
