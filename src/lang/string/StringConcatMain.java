package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b); // 이건 당연히 됨
        String result2 = a + b;
        // 참조값끼리 더하는게 어떻게 되는거지? -> 문자열은 너무 자주 다루기 때문에 자바에서 편의상 특별히 + 연산을 제공한다.

        System.out.println(result1);
        System.out.println(result2);
    }
}
