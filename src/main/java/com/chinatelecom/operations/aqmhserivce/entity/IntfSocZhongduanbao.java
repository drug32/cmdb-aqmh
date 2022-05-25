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
@Data
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


}
