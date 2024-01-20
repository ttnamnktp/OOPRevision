package decuong.quiz3;

public class Test {
    public static void main(String arg1) {
        System.out.println("Hi, " + arg1);
        Test.main("Dear Man", "My Man");
    }
    public static void main(String[] args) {
        System.out.println("Hi Man (from main)");
        Test.main("Man");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ". Hi, " + arg2);
    }
}
