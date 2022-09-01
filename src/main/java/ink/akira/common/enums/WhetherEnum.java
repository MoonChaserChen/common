package ink.akira.common.enums;

/**
 * 是/否
 *
 * @author chenhouzhang
 * @date 2022/8/30 00:13
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
}
