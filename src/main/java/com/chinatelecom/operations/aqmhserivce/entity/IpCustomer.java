package com.chinatelecom.operations.aqmhserivce.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author YangXu
 * @since 2023-04-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("public.ip_customer")
public class IpCustomer implements Serializable {


    @TableId("ip_num")
    private String ipNum;

    private String addr;

    private String type;

    private BigDecimal status;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("alter_time")
    private LocalDateTime alterTime;


}
