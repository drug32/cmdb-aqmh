package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Wang
 * @Date: 2022/7/19 15:37
 * @Description:
 */
@Data
@TableName("intf_idc_port_black_list")
public class IntfIdcPortBlackList {
    private String id;
    private String subDomain;
    private String ip;
    private String port;
    private String cityCode;
    private String firstFindTime;
    private String findTime;
}
