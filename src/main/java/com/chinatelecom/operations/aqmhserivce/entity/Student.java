package com.chinatelecom.operations.aqmhserivce.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;
import lombok.EqualsAndHashCode;

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

    private LocalDate birthday;

    private BigDecimal score;

    private String area;


}
