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
 * @since 2022-05-25
 */
@EqualsAndHashCode(callSuper = false)
@TableName("intf_soc_sifangguanli")
public class IntfSocSifangguanli implements Serializable {


    @TableField("use_id")
    private String useId;

    @TableField("system_id")
    private String systemId;

    @TableField("plat_mngcom")
    private String platMngcom;

    @TableField("plat_operatecom")
    private String platOperatecom;

    @TableField("plat_storage_info")
    private String platStorageInfo;

    @TableField("plat_storage_mlevel")
    private String platStorageMlevel;

    @TableField("plat_scope")
    private String platScope;

    @TableField("plat_acountmng")
    private String platAcountmng;

    @TableField("plat_loginlog_m")
    private String platLoginlogM;

    @TableField("plat_operate_m")
    private String platOperateM;

    @TableField("plat_kl_validity")
    private String platKlValidity;

    @TableField("regular_auditaccount")
    private String regularAuditaccount;

    @TableField("plat_ifthirdaccount")
    private String platIfthirdaccount;

    @TableField("ifthird_introduceflow")
    private String ifthirdIntroduceflow;

    @TableField("third_auditpermit")
    private String thirdAuditpermit;

    @TableField("third_outpermit")
    private String thirdOutpermit;

    @TableField("third_restartpermit")
    private String thirdRestartpermit;

    @TableField("ifthird_userinfo")
    private String ifthirdUserinfo;

    @TableField("third_comname")
    private String thirdComname;

    @TableField("third_projecttype")
    private String thirdProjecttype;

    @TableField("third_sourcemode")
    private String thirdSourcemode;

    @TableField("third_count")
    private String thirdCount;

    @TableField("ifthird_pattern")
    private String ifthirdPattern;

    @TableField("ifthird_duty")
    private String ifthirdDuty;

    @TableField("ifthird_contract")
    private String ifthirdContract;

    @TableField("ifthird_secrecy")
    private String ifthirdSecrecy;

    @TableField("third_practicable_m")
    private String thirdPracticableM;

    @TableField("third_evaluation_m")
    private String thirdEvaluationM;

    @TableField("third_evaluation_result")
    private String thirdEvaluationResult;

    private String descript;

    @TableField("create_time")
    private String createTime;

    @TableField("update_time")
    private String updateTime;

    @TableField("is_delete")
    private String isDelete;

    private String creater;

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getPlatMngcom() {
        return platMngcom;
    }

    public void setPlatMngcom(String platMngcom) {
        this.platMngcom = platMngcom;
    }

    public String getPlatOperatecom() {
        return platOperatecom;
    }

    public void setPlatOperatecom(String platOperatecom) {
        this.platOperatecom = platOperatecom;
    }

    public String getPlatStorageInfo() {
        return platStorageInfo;
    }

    public void setPlatStorageInfo(String platStorageInfo) {
        this.platStorageInfo = platStorageInfo;
    }

    public String getPlatStorageMlevel() {
        return platStorageMlevel;
    }

    public void setPlatStorageMlevel(String platStorageMlevel) {
        this.platStorageMlevel = platStorageMlevel;
    }

    public String getPlatScope() {
        return platScope;
    }

    public void setPlatScope(String platScope) {
        this.platScope = platScope;
    }

    public String getPlatAcountmng() {
        return platAcountmng;
    }

    public void setPlatAcountmng(String platAcountmng) {
        this.platAcountmng = platAcountmng;
    }

    public String getPlatLoginlogM() {
        return platLoginlogM;
    }

    public void setPlatLoginlogM(String platLoginlogM) {
        this.platLoginlogM = platLoginlogM;
    }

    public String getPlatOperateM() {
        return platOperateM;
    }

    public void setPlatOperateM(String platOperateM) {
        this.platOperateM = platOperateM;
    }

    public String getPlatKlValidity() {
        return platKlValidity;
    }

    public void setPlatKlValidity(String platKlValidity) {
        this.platKlValidity = platKlValidity;
    }

    public String getRegularAuditaccount() {
        return regularAuditaccount;
    }

    public void setRegularAuditaccount(String regularAuditaccount) {
        this.regularAuditaccount = regularAuditaccount;
    }

    public String getPlatIfthirdaccount() {
        return platIfthirdaccount;
    }

    public void setPlatIfthirdaccount(String platIfthirdaccount) {
        this.platIfthirdaccount = platIfthirdaccount;
    }

    public String getIfthirdIntroduceflow() {
        return ifthirdIntroduceflow;
    }

    public void setIfthirdIntroduceflow(String ifthirdIntroduceflow) {
        this.ifthirdIntroduceflow = ifthirdIntroduceflow;
    }

    public String getThirdAuditpermit() {
        return thirdAuditpermit;
    }

    public void setThirdAuditpermit(String thirdAuditpermit) {
        this.thirdAuditpermit = thirdAuditpermit;
    }

    public String getThirdOutpermit() {
        return thirdOutpermit;
    }

    public void setThirdOutpermit(String thirdOutpermit) {
        this.thirdOutpermit = thirdOutpermit;
    }

    public String getThirdRestartpermit() {
        return thirdRestartpermit;
    }

    public void setThirdRestartpermit(String thirdRestartpermit) {
        this.thirdRestartpermit = thirdRestartpermit;
    }

    public String getIfthirdUserinfo() {
        return ifthirdUserinfo;
    }

    public void setIfthirdUserinfo(String ifthirdUserinfo) {
        this.ifthirdUserinfo = ifthirdUserinfo;
    }

    public String getThirdComname() {
        return thirdComname;
    }

    public void setThirdComname(String thirdComname) {
        this.thirdComname = thirdComname;
    }

    public String getThirdProjecttype() {
        return thirdProjecttype;
    }

    public void setThirdProjecttype(String thirdProjecttype) {
        this.thirdProjecttype = thirdProjecttype;
    }

    public String getThirdSourcemode() {
        return thirdSourcemode;
    }

    public void setThirdSourcemode(String thirdSourcemode) {
        this.thirdSourcemode = thirdSourcemode;
    }

    public String getThirdCount() {
        return thirdCount;
    }

    public void setThirdCount(String thirdCount) {
        this.thirdCount = thirdCount;
    }

    public String getIfthirdPattern() {
        return ifthirdPattern;
    }

    public void setIfthirdPattern(String ifthirdPattern) {
        this.ifthirdPattern = ifthirdPattern;
    }

    public String getIfthirdDuty() {
        return ifthirdDuty;
    }

    public void setIfthirdDuty(String ifthirdDuty) {
        this.ifthirdDuty = ifthirdDuty;
    }

    public String getIfthirdContract() {
        return ifthirdContract;
    }

    public void setIfthirdContract(String ifthirdContract) {
        this.ifthirdContract = ifthirdContract;
    }

    public String getIfthirdSecrecy() {
        return ifthirdSecrecy;
    }

    public void setIfthirdSecrecy(String ifthirdSecrecy) {
        this.ifthirdSecrecy = ifthirdSecrecy;
    }

    public String getThirdPracticableM() {
        return thirdPracticableM;
    }

    public void setThirdPracticableM(String thirdPracticableM) {
        this.thirdPracticableM = thirdPracticableM;
    }

    public String getThirdEvaluationM() {
        return thirdEvaluationM;
    }

    public void setThirdEvaluationM(String thirdEvaluationM) {
        this.thirdEvaluationM = thirdEvaluationM;
    }

    public String getThirdEvaluationResult() {
        return thirdEvaluationResult;
    }

    public void setThirdEvaluationResult(String thirdEvaluationResult) {
        this.thirdEvaluationResult = thirdEvaluationResult;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
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

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }
}
