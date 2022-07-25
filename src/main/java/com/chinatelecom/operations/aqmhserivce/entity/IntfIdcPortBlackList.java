package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Wang
 * @Date: 2022/7/19 15:37
 * @Description:
 */
@TableName("intf_idc_port_black_list")
public class IntfIdcPortBlackList {
    private String id;
    private String subDomain;
    private String ip;
    private String port;
    private String cityCode;
    private String firstFindTime;
    private String findTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getFirstFindTime() {
        return firstFindTime;
    }

    public void setFirstFindTime(String firstFindTime) {
        this.firstFindTime = firstFindTime;
    }

    public String getFindTime() {
        return findTime;
    }

    public void setFindTime(String findTime) {
        this.findTime = findTime;
    }
}
