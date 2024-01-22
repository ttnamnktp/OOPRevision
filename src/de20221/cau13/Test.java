package de20221.cau13;

public class Test {
    public static void main(String[] args) {
        String []s = {"abc","123",null};
        for (int i = 0; i < s.length; i++){
            try {
                int a = s[i].length();
                try {
                    a = Integer.parseInt(s[i]);
                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException ");
                }
            } catch (NullPointerException e) {
                System.out.println("NullPointerException");
            }
        }
    }
}
