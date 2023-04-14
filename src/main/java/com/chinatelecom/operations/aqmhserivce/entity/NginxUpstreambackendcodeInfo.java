package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("public.nginx_upstreambackendcode_info")
public class NginxUpstreambackendcodeInfo implements Serializable {


    private LocalDateTime receivetime;

    @TableId("collector_id")
    private String collectorId;

    @TableField("object_id")
    private String objectId;

    private String upstream;

    private String backend;

    private String code;

    @TableField("nginx_vts_upstream_requests_total")
    private String nginxVtsUpstreamRequestsTotal;


}
