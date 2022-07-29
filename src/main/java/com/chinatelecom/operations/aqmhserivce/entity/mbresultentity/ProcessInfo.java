package com.chinatelecom.operations.aqmhserivce.entity.mbresultentity;

/**
 * @Author: Wang
 * @Date: 2022/7/29 11:07
 * @Description:
 */
public class ProcessInfo {
    private String state;
    private String gname;
    private String uname;
    private Integer pid;
    private Integer ppid;
    private String path;
    private String startArgs;
    private String startTime;
    private Integer root;

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

    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
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

    public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }
}
