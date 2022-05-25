package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("intf_soc_jixian")
public class IntfSocJixian {
    private String assetId;
    private String itemId;
    private String itemName;
    private String checkMode;
    private String itemResult;
    private String pointId;
    private String pointName;
    private String pointResult;
    private String checkTime;
}
