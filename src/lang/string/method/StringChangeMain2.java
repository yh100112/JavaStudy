package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "    Java Programming ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("소문자로 변환: " + strWithSpaces.toUpperCase());

        System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'"); // whitespace(스페이스바)만 제거함
        System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'"); // +유니코드 공백까지 제거함
        System.out.println("공백 제거(strip): '" + strWithSpaces.stripTrailing() + "'");
        System.out.println("공백 제거(strip): '" + strWithSpaces.stripLeading() + "'");
    }
}
