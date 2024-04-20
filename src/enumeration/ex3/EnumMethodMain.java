package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        //모든 enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", original = " + value.ordinal());
        }
        // ordinal()은 가급적 사용하지 않는 것이 좋다.

        //String -> Enum 볂놘
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString()오버라이딩되어있어서 바로 스트링으로 출력됨

    }
}
