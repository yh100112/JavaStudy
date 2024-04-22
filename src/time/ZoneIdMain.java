package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        // 타임존의 정보를 알려줌
        for(String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoutZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoutZoneId = " + seoutZoneId);

    }
}
