package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR)); // 연을 조회할거야 -> year
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR)); // month
        System.out.println("DAY_OF_MONTH = " + dt.get(ChronoField.DAY_OF_MONTH)); // day
        System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY)); // hour - 13
        System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR)); // minute - 30
        System.out.println("SECOND_OF_MINUTE = " + dt.get(ChronoField.SECOND_OF_MINUTE)); // second - 59

        System.out.println("편의 메서드 제공");
        System.out.println("YEAR = " + dt.getYear()); // 연을 조회할거야 -> year
        System.out.println("MONTH_OF_YEAR = " + dt.getMonthValue()); // month
        System.out.println("DAY_OF_MONTH = " + dt.getDayOfMonth()); // day
        System.out.println("HOUR_OF_DAY = " + dt.getHour()); // hour - 13
        System.out.println("MINUTE_OF_HOUR = " + dt.getMinute()); // minute - 30
        System.out.println("SECOND_OF_MINUTE = " + dt.getSecond()); // second - 59

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY)); // 하루에 있는 시간만 계산 - 810
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY)); // 하루에 있는 초만 계산 - 48659


    }
}
