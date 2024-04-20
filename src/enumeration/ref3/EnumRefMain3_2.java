package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        System.out.println("basic 등급의 할인 금액: " + Grade.BASIC.discount(price)); // DiscountService는 없어도 된다.
    }
}
