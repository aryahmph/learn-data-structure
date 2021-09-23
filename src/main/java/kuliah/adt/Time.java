package kuliah.adt;

import java.text.DecimalFormat;

public class Time {
    final private static DecimalFormat decimalFormat = new DecimalFormat("#.#");

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if ((hour < 0 || minute < 0 || second < 0) || (hour >= 24 || minute >= 60 || second >= 60)) {
            throw new IllegalArgumentException("time exceeds system capacity");
        } else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public String toSecond() {
        return Long.toString((hour * 60L * 60) + (minute * 60L) + second);
    }

    public String toMinute() {
        return decimalFormat.format((hour * 60) + minute + ((double) second / 60));
    }

    public String toHour() {
        return decimalFormat.format(hour + ((double) minute / 60) + ((double) second / (60 * 60)));
    }

    public static Time sumTwoTime(Time time1, Time time2) {
        int hour = time1.hour + time2.hour;
        int minute = time1.minute + time2.minute;
        int second = time1.second + time2.second;

        if (second >= 60) {
            minute += 1;
            second %= 60;
        }

        return new Time(hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour is not valid");
        } else {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute is not valid");
        } else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second is not valid");
        } else {
            this.second = second;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
            "hour=" + hour +
            ", minute=" + minute +
            ", second=" + second +
            '}';
    }

}
