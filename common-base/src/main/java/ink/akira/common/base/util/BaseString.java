package ink.akira.common.base.util;

/**
 * 基础的String工具类
 *
 * @author chenhouzhang
 * @since 2022/8/29 23:49
 */
public class BaseString {
    /**
     * 判断字符串是否为null或者""
     *
     * @param str 原字符串
     * @return true/false
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * 判断字符串是否不为null或者""
     *
     * @param str 原字符串
     * @return true/false
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 判断字符串是否为null或者""或者全为空格
     *
     * @param str 原字符串
     * @return true/false
     */
    public static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * 判断字符串是否不为null或者""或者全空格
     *
     * @param str 原字符串
     * @return true/false
     */
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    /**
     * 去除字符串所有空格
     *
     * @param str 原字符串
     * @return 去掉了所有空格的字符串
     */
    public static String trimAllWhitespace(String str) {
        if (isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int index = 0;
        while (sb.length() > index) {
            if (Character.isWhitespace(sb.charAt(index))) {
                sb.deleteCharAt(index);
            } else {
                index++;
            }
        }
        return sb.toString();
    }
}
