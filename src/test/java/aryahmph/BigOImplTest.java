package aryahmph;

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
}
