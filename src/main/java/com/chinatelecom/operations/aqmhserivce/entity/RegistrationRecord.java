package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Wang
 * @Date: 2022/7/19 15:29
 * @Description:
 */
@Data
@TableName("website_registration_record")
public class RegistrationRecord {
    private String companyName;
    private String entityIcpNo;
    private String websiteName;
    private String homeAddress;
    private String domainAddress;
    private String icpNo;
    private String ipAddress;
    private String updateTime;
    private String serverLocation;

}
