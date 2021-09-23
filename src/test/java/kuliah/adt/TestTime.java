package kuliah.adt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTime {
    @Test
    void TestTimeSuccess() {
        Time time1 = new Time(5, 30, 30);
        System.out.println(time1);
        Assertions.assertEquals("19830", time1.toSecond());
        Assertions.assertEquals("330.5", time1.toMinute());
        Assertions.assertEquals("5.5", time1.toHour());
    }

    @Test
    void TestCreateWrongTime() {
        Time time = new Time(61, 30, 30);
    }

    @Test
    void TestSetWrongTime() {
        Time time = new Time(5, 30, 30);
        time.setHour(24);
    }

    @Test
    void TestSumTime() {
        Time time = new Time(5, 30, 30);
        Time time2 = new Time(5, 30, 30);
        Time result = Time.sumTwoTime(time, time2);
        System.out.println(result);
    }
}
