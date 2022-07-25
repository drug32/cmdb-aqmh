package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author SunHu
 * @since 2022-05-27
 */
@EqualsAndHashCode(callSuper = false)
@TableName("dept_info")
public class DeptInfo implements Serializable {


    @TableField("dept_id")
    private String deptId;

    @TableField("dept_name")
    private String deptName;

    @TableField("parent_id")
    private String parentId;

    private String flag;

    @TableField("attr_flag")
    private String attrFlag;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getAttrFlag() {
        return attrFlag;
    }

    public void setAttrFlag(String attrFlag) {
        this.attrFlag = attrFlag;
    }
}
