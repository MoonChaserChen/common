package ink.akira.common.base.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * 基础的MD5工具类
 *
 * @author chenhouzhang
 * @since 2022/8/29 23:47
 */
public class BaseMD5 {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /**
     * 生成签名结果(新版本使用)
     *
     * @param sArray 要签名的数组
     * @return 签名结果字符串
     */
    public static String buildSign(Map<String, String> sArray, String keyName, String secretKey) {
        if (keyName != null && keyName.trim().length() != 0) {
            throw new IllegalArgumentException("keyName can't be empty");
        }
        try {
            String prestr = BaseMap.parse2orderedString(sArray);
            prestr = prestr + "&" + keyName + "=" + secretKey;
            return getMD5String(prestr);
        } catch (Exception e) {
            throw new RuntimeException("buildSign failed.", e);
        }
    }

    /**
     * 生成签名结果（老版本使用）
     *
     * @param sArray 要签名的数组
     * @return 签名结果字符串
     */
    public static String buildSign(Map<String, String> sArray, String secretKey) {
        try {
            String prestr = BaseMap.parse2orderedString(sArray);
            prestr = prestr + secretKey;
            return getMD5String(prestr);
        } catch (Exception e) {
            throw new RuntimeException("buildSign failed.", e);
        }
    }

    /**
     * 生成32位大写MD5值
     *
     * @param str 原字符串
     * @return MD5值
     */
    public static String getMD5String(String str) {
        try {
            if (str == null || str.trim().length() == 0) {
                return "";
            }
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            bytes = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte aByte : bytes) {
                sb.append(HEX_DIGITS[(aByte & 0xf0) >> 4]).append(HEX_DIGITS[aByte & 0xf]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ignored) {
            return "";
        }
    }
}
