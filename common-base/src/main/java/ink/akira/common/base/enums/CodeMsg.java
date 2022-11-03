package ink.akira.common.base.enums;

/**
 * Code及Msg的封装，通常用于异常码等情况
 *
 * @author chenhouzhang
 * @since 2022/11/3 20:03
 */
public interface CodeMsg {
    int getCode();

    String getMessage();
}
