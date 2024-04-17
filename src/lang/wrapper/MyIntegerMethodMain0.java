package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5); // 내 값이랑 비교하자 -> 객체지향적
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i2 = " + i3);
    }
}
