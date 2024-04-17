package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));  // false
        System.out.println("equality = " + (user1.equals(user2))); // false -> equals()도 내부로 가보면 ==을 사용해서 false인 것이다.
        // 동등성 비교를 사용하고 싶으면 equals() 메서드를 재정의해야 한다. 그렇지 않으면 Object는 동일성 비교를 기본으로 제공한다.
    }
}
