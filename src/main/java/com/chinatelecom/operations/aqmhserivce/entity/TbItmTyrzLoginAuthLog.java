package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 孙虎
 */
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

    public String getCommtype1Code() {
        return commtype1Code;
    }

    public void setCommtype1Code(String commtype1Code) {
        this.commtype1Code = commtype1Code;
    }

    public String getCommtype2Code() {
        return commtype2Code;
    }

    public void setCommtype2Code(String commtype2Code) {
        this.commtype2Code = commtype2Code;
    }

    public String getCommtype3Code() {
        return commtype3Code;
    }

    public void setCommtype3Code(String commtype3Code) {
        this.commtype3Code = commtype3Code;
    }

    public String getLogSourceIp() {
        return logSourceIp;
    }

    public void setLogSourceIp(String logSourceIp) {
        this.logSourceIp = logSourceIp;
    }

    public String getLogSourceType() {
        return logSourceType;
    }

    public void setLogSourceType(String logSourceType) {
        this.logSourceType = logSourceType;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
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

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getOrgUuid() {
        return orgUuid;
    }

    public void setOrgUuid(String orgUuid) {
        this.orgUuid = orgUuid;
    }

    public String getStaffAccount() {
        return staffAccount;
    }

    public void setStaffAccount(String staffAccount) {
        this.staffAccount = staffAccount;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getTargetClientId() {
        return targetClientId;
    }

    public void setTargetClientId(String targetClientId) {
        this.targetClientId = targetClientId;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getStaffUuid() {
        return staffUuid;
    }

    public void setStaffUuid(String staffUuid) {
        this.staffUuid = staffUuid;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLocalHost() {
        return localHost;
    }

    public void setLocalHost(String localHost) {
        this.localHost = localHost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getF5() {
        return f5;
    }

    public void setF5(String f5) {
        this.f5 = f5;
    }
}
