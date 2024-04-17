package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // 아래 둘의 결과가 같음
        System.out.println(string);
        System.out.println(object); // -> println : 사실 내부적으로 toString()을 호출하는 구조로 되어 있어서 결과가 위와 같은 것이다.
    }
}
