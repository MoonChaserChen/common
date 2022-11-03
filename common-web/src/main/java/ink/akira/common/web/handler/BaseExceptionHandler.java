package ink.akira.common.web.handler;

import ink.akira.common.base.exception.BizException;
import ink.akira.common.web.vo.ApiResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * API异常返回处理器
 *
 * @author chenhouzhang
 * @since 2022/11/3 09:59
 */
@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(BizException.class)
    public ApiResult bizExceptionHandler(BizException e) {
        return ApiResult.fail(e);
    }
}
