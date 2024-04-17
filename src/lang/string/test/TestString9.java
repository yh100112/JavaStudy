package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] parts = email.split("@");
        for (String p : parts)
            System.out.println(p);
    }
}
