package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 孙虎
 */
@TableName("empee_acct_info")
public class EmpeeAcctInfo {
    private String area;
    private String staffId;
    private String staffUuid;
    private String staffAccount;
    private String workPropName;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffUuid() {
        return staffUuid;
    }

    public void setStaffUuid(String staffUuid) {
        this.staffUuid = staffUuid;
    }

    public String getStaffAccount() {
        return staffAccount;
    }

    public void setStaffAccount(String staffAccount) {
        this.staffAccount = staffAccount;
    }

    public String getWorkPropName() {
        return workPropName;
    }

    public void setWorkPropName(String workPropName) {
        this.workPropName = workPropName;
    }

    @Override
    public String toString() {
        return "EmpeeAcctInfo{" +
                "area='" + area + '\'' +
                ", staffId='" + staffId + '\'' +
                ", staffUuid='" + staffUuid + '\'' +
                ", staffAccount='" + staffAccount + '\'' +
                ", workPropName='" + workPropName + '\'' +
                '}';
    }
}
