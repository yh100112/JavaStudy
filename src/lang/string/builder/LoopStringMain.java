package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms"); // 2.5초나 걸렸다.
        // 이런 경우에 최적화 불가 ( 반복문이라서 stringbuilder 객체와 String 객체를 총 10만번 만든다. )
    }
}
