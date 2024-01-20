package decuong.quiz4;

import java.lang.Void;
public class Test {
//    public static void change(Student std) {
//        std.setYear(2000);
//    }
    public static void change(Student std){
        std = new Student("Hung", 1995);
    }

    public static void main(String[] args) {
        Student std = new Student("Nam", 1990);
        System.out.println(std.getYear());
        change(std);
        System.out.println(std.getYear());

        String a  ;
        System.out.println(('o' + 'l' + 'o' + 'l'));
    }
}

