package aryahmph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BigOImplTest {
    private BigO bigO;

    @BeforeEach
    void setUp() {
        bigO = new BigOImpl();
    }

    @Test
    void TestConstant() {
        bigO.constant();
    }

    @Test
    void TestLinear() {
        bigO.linear(5);
    }

    @Test
    void TestSquare() {
        bigO.square(5);
    }

    @Test
    void TestBinarySearch() {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int index = bigO.binarySearch(array, 0, array.length - 1, 23);
        Assertions.assertEquals(5, index);
    }
}
