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
 * @since 2023-02-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("public.sys_dict")
public class SysDict implements Serializable {


    private Long id;

    private String name;

    private String type;

    private String code;

    private String value;

    @TableField("order_num")
    private Integer orderNum;

    private String remark;

    @TableField("del_flag")
    private Integer delFlag;


}
