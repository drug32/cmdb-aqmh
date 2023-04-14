package com.chinatelecom.operations.aqmhserivce.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author SunHu
 * @since 2023-02-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("public.robot_data")
public class RobotData implements Serializable {


    private LocalDateTime receivetime;

    private String ipaddress;

    private String account;

    private LocalDateTime executetime;

    private String robot;

    private String business;

    private String scene;

    private Integer result;

    private Integer duration;

    private String uniqueid;

    private String sceneid;


}
