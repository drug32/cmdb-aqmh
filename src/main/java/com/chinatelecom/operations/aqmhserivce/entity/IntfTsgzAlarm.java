package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * intf_tsgz_alarm
 * </p>
 *
 * @author SunHu
 * @since 2022-06-17
 */
@EqualsAndHashCode(callSuper = false)
public class IntfTsgzAlarm implements Serializable {


    private String code;

    @TableField("analysis_technology")
    private String analysisTechnology;

    @TableField("kill_chain_stage")
    private String killChainStage;

    private String app;

    @TableField("operation_event_type")
    private String operationEventType;

    private String msgtype;

    private String result;

    private String protocol;

    private String id;

    @TableField("reliability_level")
    private String reliabilityLevel;

    @TableField("event_type")
    private String eventType;

    @TableField("op_state")
    private String opState;

    private String destination;

    @TableField("is_key_event")
    private String isKeyEvent;

    private String payload;

    private String source;

    @TableField("attack_dir")
    private String attackDir;

    @TableField("op_operator")
    private String opOperator;

    @TableField("disposal_type")
    private String disposalType;

    @TableField("event_type_path")
    private String eventTypePath;

    @TableField("related_event")
    private String relatedEvent;

    @TableField("q_body")
    private String qBody;

    @TableField("r_body")
    private String rBody;

    @TableField("event_name")
    private String eventName;

    private String timestamp;

    @TableField("start_time")
    private String startTime;

    @TableField("event_rule_id")
    private String eventRuleId;

    private String groups;

    private String device;

    @TableField("op_object")
    private String opObject;

    private String alertlevel;

    @TableField("priority_level")
    private String priorityLevel;

    @TableField("disposal_suggestion")
    private String disposalSuggestion;

    @TableField("occur_count")
    private String occurCount;

    @TableField("log_id")
    private String logId;

    @TableField("session_id")
    private String sessionId;

    @TableField("threat_dir")
    private String threatDir;

    @TableField("attack_character")
    private String attackCharacter;

    @TableField("end_time")
    private String endTime;

    @TableField("judge_info")
    private String judgeInfo;

    private String extra;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAnalysisTechnology() {
        return analysisTechnology;
    }

    public void setAnalysisTechnology(String analysisTechnology) {
        this.analysisTechnology = analysisTechnology;
    }

    public String getKillChainStage() {
        return killChainStage;
    }

    public void setKillChainStage(String killChainStage) {
        this.killChainStage = killChainStage;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getOperationEventType() {
        return operationEventType;
    }

    public void setOperationEventType(String operationEventType) {
        this.operationEventType = operationEventType;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReliabilityLevel() {
        return reliabilityLevel;
    }

    public void setReliabilityLevel(String reliabilityLevel) {
        this.reliabilityLevel = reliabilityLevel;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getOpState() {
        return opState;
    }

    public void setOpState(String opState) {
        this.opState = opState;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getIsKeyEvent() {
        return isKeyEvent;
    }

    public void setIsKeyEvent(String isKeyEvent) {
        this.isKeyEvent = isKeyEvent;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAttackDir() {
        return attackDir;
    }

    public void setAttackDir(String attackDir) {
        this.attackDir = attackDir;
    }

    public String getOpOperator() {
        return opOperator;
    }

    public void setOpOperator(String opOperator) {
        this.opOperator = opOperator;
    }

    public String getDisposalType() {
        return disposalType;
    }

    public void setDisposalType(String disposalType) {
        this.disposalType = disposalType;
    }

    public String getEventTypePath() {
        return eventTypePath;
    }

    public void setEventTypePath(String eventTypePath) {
        this.eventTypePath = eventTypePath;
    }

    public String getRelatedEvent() {
        return relatedEvent;
    }

    public void setRelatedEvent(String relatedEvent) {
        this.relatedEvent = relatedEvent;
    }

    public String getqBody() {
        return qBody;
    }

    public void setqBody(String qBody) {
        this.qBody = qBody;
    }

    public String getrBody() {
        return rBody;
    }

    public void setrBody(String rBody) {
        this.rBody = rBody;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEventRuleId() {
        return eventRuleId;
    }

    public void setEventRuleId(String eventRuleId) {
        this.eventRuleId = eventRuleId;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getOpObject() {
        return opObject;
    }

    public void setOpObject(String opObject) {
        this.opObject = opObject;
    }

    public String getAlertlevel() {
        return alertlevel;
    }

    public void setAlertlevel(String alertlevel) {
        this.alertlevel = alertlevel;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getDisposalSuggestion() {
        return disposalSuggestion;
    }

    public void setDisposalSuggestion(String disposalSuggestion) {
        this.disposalSuggestion = disposalSuggestion;
    }

    public String getOccurCount() {
        return occurCount;
    }

    public void setOccurCount(String occurCount) {
        this.occurCount = occurCount;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getThreatDir() {
        return threatDir;
    }

    public void setThreatDir(String threatDir) {
        this.threatDir = threatDir;
    }

    public String getAttackCharacter() {
        return attackCharacter;
    }

    public void setAttackCharacter(String attackCharacter) {
        this.attackCharacter = attackCharacter;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getJudgeInfo() {
        return judgeInfo;
    }

    public void setJudgeInfo(String judgeInfo) {
        this.judgeInfo = judgeInfo;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
