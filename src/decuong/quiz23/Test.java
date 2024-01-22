package decuong.quiz23;

import decuong.quiz22.Demo;

import java.util.Optional;

public class Test {
    Test(Object []o){
        System.out.println("Object");
    }


    Test(Demo []o){
        System.out.println("Test");
    }

    public static void main(String[] args) {
        new Test(null);
    }
}
