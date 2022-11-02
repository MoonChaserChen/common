package ink.akira.common.enums;

/**
 * 是/否
 *
 * @author chenhouzhang
 * @since 2022/8/30 00:13
 */
public enum WhetherEnum {
    YES((byte)1, "是"),
    NO((byte)0, "否"),
    ;

    public static final byte YES_VAL = YES.getCode();
    public static final byte NO_VAL = NO.getCode();

    private byte code;
    private String message;

    WhetherEnum(byte code, String message) {
        this.code = code;
        this.message = message;
    }

    public byte getCode() {
        return code;
    }

    public void setCode(byte code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 检查val是否为true
     *
     * @param val 待检测值
     * @return val非0或非空为true，否则为false
     */
    public static boolean check(Byte val) {
        return val != null && val != NO_VAL;
    }

    /**
     * 检查val是否为true
     *
     * @param val 待检测值
     * @return val非0或非空为true，否则为false
     */
    public static boolean check(Integer val) {
        return val != null && val != NO_VAL;
    }

    /**
     * 检查val是否为true
     *
     * @param val 待检测值
     * @return val非0或非空为true，否则为false
     */
    public static boolean check(Long val) {
        return val != null && val != NO_VAL;
    }
}
