package lang.string.builder;

public class StringBuilderMain_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // 가변 객체 StringBuilder
        String string = sb.append("A").append("B").append("C").append("D") // 메서드 체이닝
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("String = " + string);
    }
}
