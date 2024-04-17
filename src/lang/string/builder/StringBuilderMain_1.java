package lang.string.builder;

public class StringBuilderMain_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // 가변 객체 StringBuilder
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(1,"Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String ( 안전한 불변 객체인 String으로 변경 ) - 사이드 이펙트 방지
        String string = sb.toString(); // 불변 객체 String
        System.out.println("String = " + string);
    }
}
