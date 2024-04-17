package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        // primitive -> wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 방식 -> 자바에서 자동으로 해줌

        // wrapper -> primitive
        int unboxedValue = boxedValue; // 오토 언박싱 -> 자바에서 자동으로 해줌

        System.out.println("boxedvalue = " + boxedValue);
        System.out.println("unboxedvalue = " + unboxedValue);
    }
}
