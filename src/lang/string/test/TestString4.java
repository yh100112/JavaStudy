package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String left = str.substring(0, str.indexOf(".txt"));
        String right = str.substring(str.indexOf(".txt"));
        System.out.println("filename = " + left);
        System.out.println("extName = " + right);
    }
}
