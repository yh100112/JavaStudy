package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 박싱
        // 빨간경고가 왜나지? -> Deprecated ( 앞으로 이거 없어질 거야 쓰지마라는 뜻 )
        // 미래에 삭제 예정, 대신에 valueOf()를 사용

        Integer integerObj = Integer.valueOf(10); // 박싱
        // -128 ~ 127 자주 사용하는 숫자 값 재사용 ( 문자열 풀처럼 자바라 미리 만들어 놓음 -> 이게 성능상 훨씬 효율적임 )
        // -128 ~ 127은 미리 생성된 new Integer() 객체를 반환하므로 추각로 객체를 생성하지 않아서 성능상 효율적임

        System.out.println("newInteger = " + newInteger); // 내부에 toString()이 오버라이딩되어 있어서 그대로 출력해도 그대로 숫자가 나옴

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue(); // 언박싱
        System.out.println("intValue = " + intValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj)); // false
        System.out.println("==: " + (newInteger.equals(integerObj))); // true

        Integer int1 = Integer.valueOf(10);
        Integer int2 = Integer.valueOf(10);
        System.out.println("==: " + (int1 == int2)); // true -> valueOf()는 문자열 풀처럼 자바가 -127 ~ 127은 미리 만들어 놓기 때문
    }
}
