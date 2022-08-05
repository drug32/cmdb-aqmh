package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Date;

/**
 * @Author: Wang
 * @Date: 2022/7/26 15:17
 * @Description:
 */
@TableName("ts_message")
public class TsMessage {
    private String id;
    private String eventTypePath;
    private Long occurCount;
    private Integer alertlevel;
    private String destination;
    private String source;
    private String assetId;
    private String destinationIp;
    private String assetAdmin;
    private String sourceCountry;
    private String sourceProvince;
    private String sourceIp;
    private Date startTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventTypePath() {
        return eventTypePath;
    }

    public void setEventTypePath(String eventTypePath) {
        this.eventTypePath = eventTypePath;
    }

    public Long getOccurCount() {
        return occurCount;
    }

    public void setOccurCount(Long occurCount) {
        this.occurCount = occurCount;
    }

    public Integer getAlertlevel() {
        return alertlevel;
    }

    public void setAlertlevel(Integer alertlevel) {
        this.alertlevel = alertlevel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getDestinationIp() {
        return destinationIp;
    }

    public void setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAssetAdmin() {
        return assetAdmin;
    }

    public void setAssetAdmin(String assetAdmin) {
        this.assetAdmin = assetAdmin;
    }

    public String getSourceCountry() {
        return sourceCountry;
    }

    public void setSourceCountry(String sourceCountry) {
        this.sourceCountry = sourceCountry;
    }

    public String getSourceProvince() {
        return sourceProvince;
    }

    public void setSourceProvince(String sourceProvince) {
        this.sourceProvince = sourceProvince;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
