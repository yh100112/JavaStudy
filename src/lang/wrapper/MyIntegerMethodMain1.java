package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }

    // 외부 메서드 compareTo를 써서 비교한다.이런 경우 value가 객체라면 객체 스스로 자기 자신의 값과 다른 값을 비교하는 메서드를 만들면 편할 것이다.
    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
