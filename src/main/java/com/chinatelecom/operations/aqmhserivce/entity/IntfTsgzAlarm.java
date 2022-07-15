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
@Data
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


}
