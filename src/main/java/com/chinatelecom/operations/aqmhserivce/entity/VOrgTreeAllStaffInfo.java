package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author SunHu
 * @since 2022-05-27
 */
@EqualsAndHashCode(callSuper = false)
@TableName("v_org_tree_all_staff_info")
public class VOrgTreeAllStaffInfo implements Serializable {


    @TableField("latn_id")
    private String latnId;

    private String xh;

    @TableField("staff_seq")
    private String staffSeq;

    private String loc;

    private String zzddybh;

    private String szsjglzzs;

    private String zsjglzzcj;

    private String zzmc;

    private String bjzzuuid;

    private String bjzzid;

    private String bjzzossid;

    private String sjzzid;

    private String bjzzsfwwd;

    private String rygszzgxlx;

    private String staffid;

    private String staffuuid;

    private String staffossid;

    private String staffname;

    private String sfzid;

    private String staffzh;

    private String jtzh;

    private String ygygxz;

    private String phone;

    private String gwlx;

    private String bgwrole;

    private String vpnrole;

    @TableField("create_time")
    private String createTime;

    @TableField("update_time")
    private String updateTime;

    public String getLatnId() {
        return latnId;
    }

    public void setLatnId(String latnId) {
        this.latnId = latnId;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getStaffSeq() {
        return staffSeq;
    }

    public void setStaffSeq(String staffSeq) {
        this.staffSeq = staffSeq;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getZzddybh() {
        return zzddybh;
    }

    public void setZzddybh(String zzddybh) {
        this.zzddybh = zzddybh;
    }

    public String getSzsjglzzs() {
        return szsjglzzs;
    }

    public void setSzsjglzzs(String szsjglzzs) {
        this.szsjglzzs = szsjglzzs;
    }

    public String getZsjglzzcj() {
        return zsjglzzcj;
    }

    public void setZsjglzzcj(String zsjglzzcj) {
        this.zsjglzzcj = zsjglzzcj;
    }

    public String getZzmc() {
        return zzmc;
    }

    public void setZzmc(String zzmc) {
        this.zzmc = zzmc;
    }

    public String getBjzzuuid() {
        return bjzzuuid;
    }

    public void setBjzzuuid(String bjzzuuid) {
        this.bjzzuuid = bjzzuuid;
    }

    public String getBjzzid() {
        return bjzzid;
    }

    public void setBjzzid(String bjzzid) {
        this.bjzzid = bjzzid;
    }

    public String getBjzzossid() {
        return bjzzossid;
    }

    public void setBjzzossid(String bjzzossid) {
        this.bjzzossid = bjzzossid;
    }

    public String getSjzzid() {
        return sjzzid;
    }

    public void setSjzzid(String sjzzid) {
        this.sjzzid = sjzzid;
    }

    public String getBjzzsfwwd() {
        return bjzzsfwwd;
    }

    public void setBjzzsfwwd(String bjzzsfwwd) {
        this.bjzzsfwwd = bjzzsfwwd;
    }

    public String getRygszzgxlx() {
        return rygszzgxlx;
    }

    public void setRygszzgxlx(String rygszzgxlx) {
        this.rygszzgxlx = rygszzgxlx;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffuuid() {
        return staffuuid;
    }

    public void setStaffuuid(String staffuuid) {
        this.staffuuid = staffuuid;
    }

    public String getStaffossid() {
        return staffossid;
    }

    public void setStaffossid(String staffossid) {
        this.staffossid = staffossid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getSfzid() {
        return sfzid;
    }

    public void setSfzid(String sfzid) {
        this.sfzid = sfzid;
    }

    public String getStaffzh() {
        return staffzh;
    }

    public void setStaffzh(String staffzh) {
        this.staffzh = staffzh;
    }

    public String getJtzh() {
        return jtzh;
    }

    public void setJtzh(String jtzh) {
        this.jtzh = jtzh;
    }

    public String getYgygxz() {
        return ygygxz;
    }

    public void setYgygxz(String ygygxz) {
        this.ygygxz = ygygxz;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGwlx() {
        return gwlx;
    }

    public void setGwlx(String gwlx) {
        this.gwlx = gwlx;
    }

    public String getBgwrole() {
        return bgwrole;
    }

    public void setBgwrole(String bgwrole) {
        this.bgwrole = bgwrole;
    }

    public String getVpnrole() {
        return vpnrole;
    }

    public void setVpnrole(String vpnrole) {
        this.vpnrole = vpnrole;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
