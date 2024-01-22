package de20221.cau4;

public class Test {
    public void check1 (int n) throws ArithmeticException {
        if (n <= 0) throw new ArithmeticException("Number should be greater than 0");
    }
    public void check2 (int n) throws RuntimeException {
        if (n == 5) throw new RuntimeException("Number should be equal to 5");
    }
    public void check3(int n) throws RuntimeException {
        check1(n);
        check2(n);
    }

    public void test() throws ArithmeticException{
        int n = 4;
        check1(n);
        check2(n);
        check3(n);
    }

    public static void main(String[] args) throws Exception {
        Test t = new Test();
        t.test();
    }
}
