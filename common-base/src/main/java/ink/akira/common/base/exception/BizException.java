package ink.akira.common.base.exception;

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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
