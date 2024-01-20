package decuong.quiz2;

public class Test {
    private void myFunction(int a, long b) {
        System.out.println("int long");
    }
    private void myFunction(long a, int b) {
        System.out.println("long int");
    }

    public Test() {
    }

    private Test(Object o) {
        System.out.println("object");
    }

    private Test(Double []array) {
        System.out.println("array");
    }

    private Test(Integer t) {
        System.out.println("double");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.myFunction(3, (long) 8);
        new Test((Double[]) null);
    }
}
