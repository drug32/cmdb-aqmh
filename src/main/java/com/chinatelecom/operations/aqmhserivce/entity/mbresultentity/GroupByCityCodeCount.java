package com.chinatelecom.operations.aqmhserivce.entity.mbresultentity;

import lombok.Data;

/**
 * @Author: Wang
 * @Date: 2022/7/19 16:53
 * @Description:
 */
@Data
public class GroupByCityCodeCount {
    private String cityCode;
    private Long countNum;
}
