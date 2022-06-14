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
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("public.v_org_tree_all_staff_info")
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


}
