package ink.akira.common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 基础的Map工具类
 *
 * @author chenhouzhang
 * @date 2022/8/29 23:49
 */
public class BaseMapUtils {
    /**
     * Map转化为有序String
     *
     * @param paramMap 原Map
     * @return 有序String
     */
    public static String parse2orderedString(Map<String, String> paramMap) {
        if (paramMap == null) {
            return "";
        }
        StringBuilder content = new StringBuilder();
        List<String> keys = new ArrayList<>(paramMap.keySet());
        Collections.sort(keys);
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = paramMap.get(key);
            if (BaseStringUtils.isNotEmpty(key) && BaseStringUtils.isNotEmpty(value)) {
                content.append(i == 0 ? "" : "&").append(key).append("=").append(value);
            }
        }
        return content.toString();
    }
}
