package ink.akira.common.web.handler;

import ink.akira.common.web.vo.ApiResult;
import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * API返回处理器
 *
 * @author chenhouzhang
 * @since 2022/11/3 09:59
 */
public class ApiReturnValueHandler implements HandlerMethodReturnValueHandler {

    private final HandlerMethodReturnValueHandler handler;

    public ApiReturnValueHandler(HandlerMethodReturnValueHandler handler) {
        this.handler = handler;
    }

    @Override
    public boolean supportsReturnType(MethodParameter methodParameter) {
        return handler.supportsReturnType(methodParameter);
    }

    @Override
    public void handleReturnValue(Object returnValue, MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest) throws Exception {
        if (returnValue instanceof ApiResult) {
            handler.handleReturnValue(returnValue, methodParameter, modelAndViewContainer, nativeWebRequest);
            return;
        }
        handler.handleReturnValue(ApiResult.ok(returnValue), methodParameter, modelAndViewContainer, nativeWebRequest);
    }
}
