package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 孙虎
 */
@Data
@TableName("empee_acct_info")
public class EmpeeAcctInfo {
    private String area;
    private String staffId;
    private String staffUuid;
    private String staffAccount;
    private String workPropName;
}
