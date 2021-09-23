package list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicArrayTest {
    @Test
    void TestDynamicArrayAdd() {
        DynamicArray dynamicArray = new DynamicArray(5);
        // Add
        for (int i = 0; i < 5; i++) {
            dynamicArray.add(i);
        }

        Assertions.assertEquals(5, dynamicArray.size());
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(i, dynamicArray.indexAt(i));
        }

        // Grow size
        dynamicArray.add(6);
        Assertions.assertEquals(6, dynamicArray.indexAt(5));
    }

    @Test
    void TestDynamicArrayAddAt() {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i < 3; i++) {
            dynamicArray.add(i);
        }

        dynamicArray.addAt(99, 1);
        Assertions.assertEquals(4, dynamicArray.size());

        // 0, 99, 1, 2
        Assertions.assertThrows(IllegalArgumentException.class, () -> dynamicArray.addAt(99, 4));
    }
}
