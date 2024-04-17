package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result); // 6

        // 이 4개는 다 똑같은 것을 가리킴
        System.out.println(adder);
        System.out.println(adder1);
        System.out.println(adder2);
        System.out.println(adder3);
    }
}
