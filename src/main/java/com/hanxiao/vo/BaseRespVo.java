package com.hanxiao.vo;

import lombok.Data;

@Data
public class BaseRespVo<T> {
    T data;
    String msg;
    Integer code;

    public static BaseRespVo ok() {
        return BaseRespVo.ok(null);
    }

    public static <T> BaseRespVo ok(T data) {
        BaseRespVo<T> tBaseRespVo = new BaseRespVo<>();
        tBaseRespVo.setData(data);
        tBaseRespVo.setMsg("success");
        tBaseRespVo.setCode(0);
        return tBaseRespVo;
    }

    public static BaseRespVo fail() {
        return BaseRespVo.fail(null);
    }

    public static <T> BaseRespVo fail(T data) {
        BaseRespVo<T> tBaseRespVo = new BaseRespVo<>();
        tBaseRespVo.setMsg("fail");
        tBaseRespVo.setCode(500);
        tBaseRespVo.setData(data);
        return tBaseRespVo;
    }

}
