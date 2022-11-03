package ink.akira.common.web.vo;

import ink.akira.common.base.enums.StatusCodeEnum;
import ink.akira.common.base.exception.BizException;

/**
 * API返回结构体
 *
 * @author chenhouzhang
 * @since 2022/11/3 09:59
 */
public class ApiResult<T> {
    /**
     * 响应码
     */
    private Integer code;

    /**
     * 消息内容
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    public ApiResult() {
    }

    public ApiResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> ApiResult ok(T data) {
        return new ApiResult<>(StatusCodeEnum.OK.getCode(), StatusCodeEnum.OK.getMessage(), data);
    }

    public static ApiResult fail(BizException ex) {
        return new ApiResult<>(ex.getCode(), ex.getMessage());
    }
}
