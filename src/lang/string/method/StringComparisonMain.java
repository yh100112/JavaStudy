package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; // 대문자 일부 있음
        String str2 = "hello, java!"; // 대문자 없음 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'c' compareTo 'a': " + "c".compareTo("a")); // 2 -> "a"보다 사전적으로 2개 차이남
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); // 1 -> 사전적으로 1개 차이남
        System.out.println("'a' compareTo 'b': " + "a".compareTo("b")); // -1

        System.out.println("str1 start with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!"));
    }
}
