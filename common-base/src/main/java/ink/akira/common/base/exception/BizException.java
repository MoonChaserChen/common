package ink.akira.common.base.exception;

import ink.akira.common.base.enums.CodeMsg;
import ink.akira.common.base.enums.StatusCodeEnum;

/**
 * 业务异常
 *
 * @author chenhouzhang
 * @since 2022/11/3 09:59
 */
public class BizException extends RuntimeException {
    private int code;

    public BizException(int code) {
        this.code = code;
    }

    public BizException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BizException(CodeMsg codeMsg) {
        super(codeMsg.getMessage());
        this.code = codeMsg.getCode();
    }

    /**
     * 使用自定义的场景相关的message代替ExceptionCodeEnum中通用的message
     *
     * @param exceptionCode 异常code
     * @param message 异常提示
     */
    public BizException(StatusCodeEnum exceptionCode, String message) {
        super(message);
        this.code = exceptionCode.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
