package com.lxg.common;

import com.lxg.common.enums.CommonEnum;
import lombok.Data;

/**
 * @Description: 返回结果
 * @Author: XIANGUO LI
 * @Date: 2019-8-30 15:23
 */
@Data
public class Result {
    /**
     * 返回结构状态
     */
    private Boolean flag;

    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据内容
     */
    private Object data;

    public Result(CommonEnum commonEnum, Object data) {
        this.flag = commonEnum.flag();
        this.code = commonEnum.getResultCode();
        this.message = commonEnum.getResultMsg();
        this.data = data;
    }


    public Result(CommonEnum commonEnum) {
        this.flag = commonEnum.flag();
        this.code = commonEnum.getResultCode();
        this.message = commonEnum.getResultMsg();
    }

    public Result() {
    }

    /**
     * 自定义异常
     */
    public Result(Integer code, String message) {
        this.flag = false;
        this.code = code;
        this.message = message;
    }
}
