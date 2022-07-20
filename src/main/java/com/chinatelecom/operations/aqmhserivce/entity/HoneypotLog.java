package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Wang
 * @Date: 2022/7/19 15:33
 * @Description:
 */
@Data
@TableName("tb_noc_honeypot_log")
public class HoneypotLog {
    private String commtype1code;
    private String commtype2code;
    private String commtype3code;
    private String logsourceip;
    private String logsourcetype;
    private String logname;
    private String attackTime;
    private String hostName;
    private String hostIp;
    private String attackSrcip;
    private String attackSrcport;
    private String attackDestip;
    private String attackDestprot;
    private String attackDesc;
    private String attackCata;
    private String attackType;
    private String protocal;
    private String severityLevel;
    private String alarmLevel;
}
