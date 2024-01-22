package de20221.cau1;

public class Test {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            int i = 5/0;
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
        System.out.println(5);
    }
}
