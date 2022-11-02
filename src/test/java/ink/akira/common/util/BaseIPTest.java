package ink.akira.common.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * 基础的ip工具类
 *
 * @author chenhouzhang
 * @since 2022/11/02 21:53
 */
public class BaseIPTest {
    @Test
    public void baseTest() {
        String ipStr = "101.25.124.26";
        Assert.assertEquals(ipStr, BaseIP.int2ip(BaseIP.ip2int(ipStr)));
    }
}
