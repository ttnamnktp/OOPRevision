package decuong.quiz13;

import w9.stack.Test;

public class TestException extends Exception {
}

class Main{
    public static void main(String[] args) {
        try {
            throw new TestException();
        } catch (Exception e) {
            System.out.println("Catch exception");
        } finally {
            System.out.println("Finally block");
        }
    }
}
