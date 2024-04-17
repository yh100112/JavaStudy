package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str); // 문자가 합쳐지지 않았다. -> String은 불변 객체라서

        String str2 = str.concat( " java"); // concat은 String 반환 타입이라 따로 받아줘야 한다.
        System.out.println("str = " + str2);

        String str3 = "aaa";
        str3 += "3";
        System.out.println(str3);
    }
}
