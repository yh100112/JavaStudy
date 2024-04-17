package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};
        /*
        Object[] objects = new Object[3];
        objects[0] = new Dog();
        objects[1] = new Car();
        objects[2] = new Object();
         */

        size(objects);
    }

    // 이건 자바를 사용하는 곳이라면 추가로 수정할 필요 없이 어디서든지 사용할 수 있다. -> Object는 모든 걸 다 담을 수 있기 때문
    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}
