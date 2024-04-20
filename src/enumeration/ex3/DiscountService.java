package enumeration.ex3;

import static enumeration.ex3.Grade.*; // static final 상수이므로 static import를 하면 코드 가독성이 훨씬 좋아진다.

public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == BASIC) {
            discountPercent = 10;
        } else if (classGrade == GOLD) {
            discountPercent = 20;
        } else if (classGrade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
