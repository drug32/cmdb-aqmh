package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 孙虎
 */
@Data
@TableName("tb_itm_tyrz_login_auth_log")
public class TbItmTyrzLoginAuthLog {
    private String commtype1Code;
    private String commtype2Code;
    private String commtype3Code;
    private String logSourceIp;
    private String logSourceType;
    private String logName;
    private String logId;
    private String sessionId;
    private String serviceCode;
    private String clientCode;
    private String orgUuid;
    private String staffAccount;
    private String redirectUri;
    private String requestTime;
    private String responseTime;
    private String logLevel;
    private String resultStatus;
    private String responseContent;
    private String requestContent;
    private String consumeTime;
    private String requestIp;
    private String statusCode;
    private String targetClientId;
    private String requestMethod;
    private String authType;
    private String staffUuid;
    private String userAgent;
    private String serviceName;
    private String createTime;
    private String localHost;
    private String code;
    private String f5;
}
