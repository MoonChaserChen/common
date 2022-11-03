package ink.akira.common.base.enums;

/**
 * 通用统一异常码
 * <p>参见谷歌异常码规范：https://google-cloud.gitbook.io/api-design-guide/errors</p>
 * <p>业务在使用自定义异常码之前，应优先考虑使用通用的异常码，例如“参数异常”等</p>
 *
 * @author chenhouzhang
 * @since 2022/11/3 19:44
 */
public enum StatusCodeEnum implements CodeMsg {
    OK(200, "OK", "没有错误"),
    INVALID_ARGUMENT(400, "参数异常"),
    UNAUTHENTICATED(401, "未认证"),
    PERMISSION_DENIED(403, "权限不足"),
    NOT_FOUND(404, "未找到资源"),
    ALREADY_EXISTS(409, "资源已存在"),
    ;

    /**
     * 异常码，前端透出
     */
    private int code;
    /**
     * 异常信息，前端透出（通常进行alert处理）
     */
    private String message;
    /**
     * 注释说明信息
     */
    private String description;

    StatusCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    StatusCodeEnum(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
