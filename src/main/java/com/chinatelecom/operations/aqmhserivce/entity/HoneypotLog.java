package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Wang
 * @Date: 2022/7/19 15:33
 * @Description:
 */
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

    public String getCommtype1code() {
        return commtype1code;
    }

    public void setCommtype1code(String commtype1code) {
        this.commtype1code = commtype1code;
    }

    public String getCommtype2code() {
        return commtype2code;
    }

    public void setCommtype2code(String commtype2code) {
        this.commtype2code = commtype2code;
    }

    public String getCommtype3code() {
        return commtype3code;
    }

    public void setCommtype3code(String commtype3code) {
        this.commtype3code = commtype3code;
    }

    public String getLogsourceip() {
        return logsourceip;
    }

    public void setLogsourceip(String logsourceip) {
        this.logsourceip = logsourceip;
    }

    public String getLogsourcetype() {
        return logsourcetype;
    }

    public void setLogsourcetype(String logsourcetype) {
        this.logsourcetype = logsourcetype;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getAttackTime() {
        return attackTime;
    }

    public void setAttackTime(String attackTime) {
        this.attackTime = attackTime;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getAttackSrcip() {
        return attackSrcip;
    }

    public void setAttackSrcip(String attackSrcip) {
        this.attackSrcip = attackSrcip;
    }

    public String getAttackSrcport() {
        return attackSrcport;
    }

    public void setAttackSrcport(String attackSrcport) {
        this.attackSrcport = attackSrcport;
    }

    public String getAttackDestip() {
        return attackDestip;
    }

    public void setAttackDestip(String attackDestip) {
        this.attackDestip = attackDestip;
    }

    public String getAttackDestprot() {
        return attackDestprot;
    }

    public void setAttackDestprot(String attackDestprot) {
        this.attackDestprot = attackDestprot;
    }

    public String getAttackDesc() {
        return attackDesc;
    }

    public void setAttackDesc(String attackDesc) {
        this.attackDesc = attackDesc;
    }

    public String getAttackCata() {
        return attackCata;
    }

    public void setAttackCata(String attackCata) {
        this.attackCata = attackCata;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public String getProtocal() {
        return protocal;
    }

    public void setProtocal(String protocal) {
        this.protocal = protocal;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }
}
