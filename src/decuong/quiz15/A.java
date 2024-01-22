package decuong.quiz15;

public class A {
    A (){
        System.out.println(1);
    }

    final int x(){
        return 2;
    }

    public static void main(String[] args) {
        new B();
    }
}

class B extends A {
    B(){super();}

}
