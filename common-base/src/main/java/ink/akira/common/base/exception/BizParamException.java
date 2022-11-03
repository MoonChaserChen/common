package ink.akira.common.base.exception;

import ink.akira.common.base.enums.StatusCodeEnum;

/**
 * 业务参数异常
 *
 * @author chenhouzhang
 * @since 2022/11/3 20:05
 */
public class BizParamException extends BizException {
    public BizParamException(String message) {
        super(StatusCodeEnum.INVALID_ARGUMENT.getCode(), message);
    }
}
