package enumeration.ref3;

public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;

        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);

//        System.out.println("basic 등급의 할인 금액: " + Grade.BASIC.discount(price)); // DiscountService는 없어도 된다.
//        System.out.println("gold 등급의 할인 금액: " + Grade.GOLD.discount(price)); // DiscountService는 없어도 된다.
//        System.out.println("diamond 등급의 할인 금액: " + Grade.DIAMOND.discount(price)); // DiscountService는 없어도 된다.
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
