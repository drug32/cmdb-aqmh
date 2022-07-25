package com.chinatelecom.operations.aqmhserivce.entity.mbresultentity;

/**
 * @Author: Wang
 * @Date: 2022/7/19 16:53
 * @Description:
 */
public class GroupByCityCodeCount {
    private String codeName;
    private Long countNum;

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public Long getCountNum() {
        return countNum;
    }

    public void setCountNum(Long countNum) {
        this.countNum = countNum;
    }
}
