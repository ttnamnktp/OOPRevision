package draft.test2;

public class DelegateExceptionDemo {
    public static void main(String args[]){
        try {
            int num = calculate(9, 3);
            System.out.println("Lan 1: " + num);
            num = calculate(9, 0);
            System.out.println("Lan 2: " + num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static int calculate(int no, int no1)
            throws ArithmeticException {
        if (no1 == 0)
            throw new
                    ArithmeticException("Khong the chia cho 0!");
        int num = no / no1;
        return num;
    }
}