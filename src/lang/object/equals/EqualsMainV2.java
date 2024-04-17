package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2));// false // default  : 객체 동일성 체크
        System.out.println("eqaulity = " + user1.equals(user2));// true // override : 동등성을 필요해서 직접 오버라이딩해서 구현한 것
        // 객체가 같은지 체크할 때 eqauls를 써야 하는데 equals는 기본적으로 ==으로 구현되어 있다. 그래서 필드가 다 같은 객체여도 둘은 다른 물리적 메모리 주소에
        // 있기 때문에 false가 나온다. 이럴 때 둘이 같다고 판단하고 싶을 때 객체가 같은지 체크하는 eqauls()를 오버라이딩해서 직접 구현해야 한다.
    }
}
