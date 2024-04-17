package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("new String() == 비교: " + (str1 == str2)); // false
        System.out.println("new String() equals 비교: " + str1.equals(str2)); // true -> String 안에 equals()를 오버라이딩 해 놔서 true가 나온다.

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        // true -> ? 이거 왜 true가 나오지?
        /*
        문자열 리터럴을 사용하는 경우 자바는 메모리 효율성, 성능 최적화를 위해 문자열 풀을 사용한다.
        자바가 실행하기 전에 프로그램을 로딩하는 시점에 클래스에 문자열 리터럴이 있으면
        코드를 쭉 보면서 문자열 리터럴들을 모두 문자열 풀에 만들어 놓는다.
        -> 메모리 사용 줄이고 성능도 최적화 할 수 있다.
         */

        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4))); // true
    }
}
