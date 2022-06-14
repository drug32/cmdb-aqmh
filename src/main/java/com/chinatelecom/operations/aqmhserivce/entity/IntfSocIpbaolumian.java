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
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("public.intf_soc_ipbaolumian")
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


}
