package enumeration.ref3;

public class DiscountService {
    public int discount(Grade Grade, int price) {
        return Grade.discount(price);
    }
}
