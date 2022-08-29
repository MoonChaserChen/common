package ink.akira.common.util;

import org.junit.Test;

import java.util.List;

import static ink.akira.common.util.BaseListUtils.getByPage;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static org.junit.Assert.assertEquals;

/**
 * 测试BaseList
 *
 * @author chenhouzhang
 * @date 2022/8/29 23:25
 */
public class BaseListUtilsTest {
    @Test
    public void testGetByPage() {
        List<String> list = asList("a", "b", "c", "d", "e");
        assertEquals(asList("a", "b", "c", "d"), getByPage(list, 1, 4));
        assertEquals(asList("a", "b", "c", "d", "e"), getByPage(list, 1, 5));
        assertEquals(asList("a", "b", "c", "d", "e"), getByPage(list, 1, 6));
        assertEquals(asList("c", "d"), getByPage(list, 2, 2));
        assertEquals(asList("d", "e"), getByPage(list, 2, 3));
        assertEquals(singletonList("e"), getByPage(list, 2, 4));
        assertEquals(emptyList(), getByPage(list, 2, 5));
        assertEquals(emptyList(), getByPage(list, 2, 8));
        assertEquals(emptyList(), getByPage(list, 6, 1));
        assertEquals(emptyList(), getByPage(list, 3, 3));
        assertEquals(emptyList(), getByPage(list, 0, 8));
        assertEquals(emptyList(), getByPage(list, 0, 0));
        assertEquals(emptyList(), getByPage(list, -1, 0));
        assertEquals(emptyList(), getByPage(list, -1, 8));
        assertEquals(emptyList(), getByPage(emptyList(), 1, 8));
        assertEquals(emptyList(), getByPage(null, 1, 8));
    }
}
