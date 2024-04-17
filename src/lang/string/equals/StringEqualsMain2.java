package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        // 개발자 1
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1 : " + isSame(str1, str2)); // false


        // 개발자 2
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2 : " + isSame(str3, str4)); // true
    }

    private static boolean isSame(String x, String y) {
        // return x == y;
        return x.equals(y); // 문자열에 대한 비교는 항상 equals()를 해야 한다. 항상 동등성 비교를 해야 한다.
    }
}
