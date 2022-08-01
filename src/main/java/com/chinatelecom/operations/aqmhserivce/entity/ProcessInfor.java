package com.chinatelecom.operations.aqmhserivce.entity;

import java.sql.Date;

/**
 * @Author: Wang
 * @Date: 2022/8/1 11:30
 * @Description: 对应数据库的字段
 */
public class ProcessInfor {
    private String state;
    private String gname;
    private String uname;
    private Integer pid;
    private String ppid;
    private String path;
    private String startArgs;
    private String startTime;
    private String root;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPpid() {
        return ppid;
    }

    public void setPpid(String ppid) {
        this.ppid = ppid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStartArgs() {
        return startArgs;
    }

    public void setStartArgs(String startArgs) {
        this.startArgs = startArgs;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }
}
