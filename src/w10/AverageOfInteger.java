package w10;

import java.util.Scanner;

public class AverageOfInteger {
    private double average = 0;
    private int size = 0;

    // Phương thức kiểm tra xem một chuỗi có phải là một số hay không
    private static boolean isNumber(String input) {
        try {
            // Sử dụng lớp Double để chuyển đổi chuỗi thành số
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Phương thức kiểm tra xem một chuỗi có phải là số nguyên hay không
    private static boolean isInteger(String input) {
        try {
            // Sử dụng lớp Integer để chuyển đổi chuỗi thành số nguyên
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        AverageOfInteger averageOfInteger = new AverageOfInteger();
        averageOfInteger.calculAverage();

    }

    public void calculAverage() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số nguyên: ");
            String newStringInt = scanner.next();
            try {
                if (newStringInt.isEmpty()) {
                    throw new IllegalArgumentException("Xâu đầu vào là xâu rỗng");
                }

                if (!isNumber(newStringInt)) {
                    throw new IllegalArgumentException("Xâu đầu vào không phải số");
                }

                if (!isInteger(newStringInt)) {
                    throw new IllegalArgumentException("Xâu đầu vào không phải số nguyên");
                }


                int newInt = Integer.parseInt(newStringInt);
                average = (average * (size) + newInt) / ++size;
                System.out.println("Trung bình: " + average);
            } catch (IllegalArgumentException e) {
                System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
            }
        } while (average != 5);
        scanner.close();
    }
}
