package com.chinatelecom.operations.aqmhserivce.entity;

import java.beans.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author YangXu
 * @since 2023-04-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("public.student")
public class Student implements Serializable {


    private Integer id;

    private String name;

//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private BigDecimal score;

    private String area;

//    @TableField(exist = false)
    private List<EmpeeAcctInfo> empeeList;


}
