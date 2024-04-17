package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer = Integer.parseInt(str);
        int intt = integer.intValue();
        Integer integer2 = Integer.valueOf(intt);

    }
}
