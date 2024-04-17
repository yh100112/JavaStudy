package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }


    private static void action(Object obj) {
        // obj.sound(); // ? 안되네? -> obj 타입에는 sound()나 move()가 당연히 없기 때문
        // obj.move();

        // 객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
