package w10;

import java.io.IOException;

public class DelegateExceptionDemo {
    public static void main(String args[]){
        try{
            int num = calculate(9,3);
            System.out.println("Lan 1: " + num);
            num = calculate(9,0);
            System.out.println("Lan 2: " + num);
        } catch (Exception e) {
            System.out.println("lỗi");
        }
//        int num = calculate(9,3);
//        System.out.println("Lan 1: " + num);
//        num = calculate(9,0);
//        System.out.println("Lan 2: " + num);
    }
    static int calculate(int no, int no1)
            throws IOException {
        if (no1 == 0)
            throw new
                    IOException("Khong the chia cho 0!");
        int num = no / no1;
        return num;
    }
}