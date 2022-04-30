import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class KataReturnListTest {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> newList = new ArrayList<>();
        for (Object i : list) {
            if (i.getClass() == Integer.class) {
                newList.add(i);
            }
        }
        System.out.println(newList);
        return newList;
    }

    @Test
    public void examples() {
        assertEquals(List.of(1, 2), KataReturnListTest.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        assertEquals(List.of(1, 0, 15), KataReturnListTest.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        assertEquals(List.of(1, 2, 123), KataReturnListTest.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}
