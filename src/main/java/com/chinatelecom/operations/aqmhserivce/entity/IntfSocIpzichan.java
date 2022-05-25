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
@Data
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


}
