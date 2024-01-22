package decuong.quiz21;

public class Demo {
    public static void main(String[] args) {
        try {
            nestedTry();
        } catch (Exception e) {
            System.out.println("AAA");
        }
    }

    static void nestedTry() {
        try {
            int i = Integer.parseInt("abc");
        } catch (NullPointerException e) {
            System.out.println("BBB");
        }
    }
}
