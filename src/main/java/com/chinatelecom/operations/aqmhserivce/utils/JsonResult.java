package com.chinatelecom.operations.aqmhserivce.utils;

import com.chinatelecom.udp.core.lang.json.JSONObject;

import java.io.Serializable;

/**
 * @author 孙虎
 * @Description 返回结果封装
 */
public class JsonResult extends JSONObject implements Serializable {


    private static final long serialVersionUID = -4800793124936904868L;
    public static final int SUCCESS = 200;
    public static final int ERROR = 201;
    public static final boolean TRUE = true;

    public JsonResult() {
    }

    public JsonResult(int state, Object data, String message) {
        this.put("state",state).put("message",message).put("data",data);
    }

    /** @Author 孙虎
     * @Description //返回操作消息（成功/失败)
     * @date 17:10 2022/4/2
     * @Param [message, isSuccess]
     **/
    public JsonResult(String message,boolean isSuccess) {
        //成功
        if(isSuccess==TRUE){
            this.put("state",SUCCESS).put("message",message);
        //失败
        }else{
            this.put("state",ERROR).put("message",message);
        }
    }

    /**
     * @Author 孙虎
     * @Description //返回查询的数据
     * @date 17:12 2022/4/2
     * @Param [data]
     **/
    public JsonResult(Object data) {
        this.put("data", data).put("state", SUCCESS);
    }

}

