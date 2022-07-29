package com.chinatelecom.operations.aqmhserivce.entity.mbresultentity;

import java.util.List;

/**
 * @Author: Wang
 * @Date: 2022/7/29 11:04
 * @Description:
 */
public class UserAccountInfo {
    private String groups;
    private String name;
    private Integer status;
    private String home;
    private String lastLoginTime;
    private String lastLoginIp;

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
}
