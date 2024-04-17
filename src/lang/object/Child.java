package lang.object;

// 명시적으로 특정 클래스를 상속받은 경우는 Object 클래스를 상속받지 않는다. -> 결국 상속받은 최종 끝단에 있는 Parent는 결국 Object를 상속받는다.
public class Child extends Parent {
    public void childMethod() {
        System.out.println("Child.childMethod");
    }

}
