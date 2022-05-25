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
@Data
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


}
