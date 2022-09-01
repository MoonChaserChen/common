package ink.akira.common.util;

/**
 * 基础文件工具类
 *
 * @author chenhouzhang
 * @date 2022/8/29 23:41
 */
public class BaseFileUtils {
    /**
     * 获取文件后缀
     *
     * @param fileNameWithSuffix 带后缀的文件名
     * @return 文件后缀
     */
    public static String getSuffix(String fileNameWithSuffix) {
        if (fileNameWithSuffix == null) {
            return null;
        }
        int i = fileNameWithSuffix.lastIndexOf(".");
        if (i == -1 || i == fileNameWithSuffix.length() - 1) {
            return null;
        }
        return fileNameWithSuffix.substring(i + 1);
    }

    /**
     * 获取不带后缀文件名
     *
     * @param fileNameWithSuffix 带后缀的文件名
     * @return 不带后缀文件名
     */
    public static String getFileNameWithOutSuffix(String fileNameWithSuffix) {
        if (fileNameWithSuffix == null) {
            return null;
        }
        int i = fileNameWithSuffix.lastIndexOf(".");
        if (i == -1 || i == fileNameWithSuffix.length() - 1) {
            return fileNameWithSuffix;
        }
        return fileNameWithSuffix.substring(0, i);
    }
}
