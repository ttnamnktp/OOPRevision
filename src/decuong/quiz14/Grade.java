package decuong.quiz14;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) throws InvalidGrade {
        Grade grade1 = new Grade();
        grade1.inputGrade();
    }
    private float value;

    public void inputGrade() throws InvalidGrade {
        try {
            Scanner scanner = new Scanner(System.in);

            if(!scanner.hasNextFloat()) throw new InvalidGrade("Không phải số nguyên");

            float grade = scanner.nextFloat();
            scanner.close();

            if (grade > 10) throw new InvalidGrade("Giá trị lớn hơn 10");
            if (grade < 0) throw new InvalidGrade("Giá trị nhỏ hơn 0");

            this.value = grade;
            System.out.println(this.value);

        } catch (InvalidGrade e) {
            System.out.println("Ngoại lệ: " + e.getMessage());
        }
    }
}

class InvalidGrade extends Exception {
    public InvalidGrade(String message) {
        super(message);
    }
}
