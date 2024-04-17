package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        // primitive -> wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // wrapper -> primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedvalue = " + boxedValue);
        System.out.println("unboxedvalue = " + unboxedValue);

        // 할 때마다 바꿔줘야해? 너무 불편해~~
        // 그래서 아주 예전버전인 자바1.5부터 오토 박싱, 오토 언박식을 지원한다.
    }
}
