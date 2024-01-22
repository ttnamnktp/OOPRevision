package decuong.quiz18;

public class Demo {
    int i = 111;
    static int j =222;
    static void method1(int i, int j){
        System.out.println(i + " " + j);
    }

    public static void main(String[] args) {
        Demo.method1(333,444);
    }
}
