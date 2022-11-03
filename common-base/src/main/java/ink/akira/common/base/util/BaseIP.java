package ink.akira.common.base.util;

import java.util.regex.Pattern;

/**
 * 基础的ip工具类
 *
 * @author chenhouzhang
 * @since 2022/8/29 23:36
 */
public class BaseIP {
    /**
     * IP正则格式
     */
    public static final Pattern IP_FMT = Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}");

    /**
     * ip转为整数
     *
     * @param ipStr IP字符串
     * @return IP整数代表
     */
    public static long ip2int(String ipStr) {
        if (ipStr == null) {
            throw new IllegalArgumentException("ip can't be null");
        }
        if (!IP_FMT.matcher(ipStr).matches()) {
            throw new IllegalArgumentException(String.format("ip is not legal for %s", ipStr));
        }
        String[] splits = ipStr.split("\\.");
        long ip1 = Long.parseLong(splits[0]);
        int ip2 = Integer.parseInt(splits[1]);
        int ip3 = Integer.parseInt(splits[2]);
        int ip4 = Integer.parseInt(splits[3]);
        if ((ip1 < 1 || ip1 > 255) || (ip2 < 0 || ip2 > 255) || (ip3 < 0 || ip3 > 255) || (ip4 < 0 || ip4 > 255)){
            throw new IllegalArgumentException(String.format("ip is not legal for %s", ipStr));
        }
        long result = 0L;
        result |= ip4;
        result |= (ip3 << 8);
        result |= (ip2 << 16);
        result |= (ip1 << 24);
        return result;
    }

    /**
     * 整数转为ip
     *
     * @param ip IP整数代表
     * @return IP字符串
     */
    public static String int2ip(long ip) {
        if (ip < 1 || ip >= (1L << 32)){
            throw new IllegalArgumentException(String.format("ip is not legal for %s",ip));
        }
        return String.valueOf(ip >> 24) + '.' + ((ip >> 16) & 0xff) + '.' +
                ((ip >> 8) & 0xff) + '.' + (ip & 0xff);
    }
}
