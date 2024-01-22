package decuong.quiz19;

import java.util.Iterator;
import java.util.List;

abstract class A implements I{
    static int i = 5;
    private void print(){
        System.out.println("A");
    }

     static void print2(){
        System.out.println("new A");
    }

    final void print3(){
        System.out.println("final A");
    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    void print4(int a){
        System.out.println("A");
    }

}

class B extends A{
    int i = 10;
    public B(){
        super();
    }

    void printfloat(float z){
        System.out.println(z);
    }
    private void print(){
        System.out.println("B");
    }

    static void print2(){
        System.out.println("new B");
    }

    void print4(int a)
    {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);

        a.print2();
        B.print2();
        ((B)a).printfloat(5);

        B b = new B();

//        a.i = 100;
//        A a1 = new B();
//        System.out.println(a1.i);
//        B b = new B();
//        System.out.println(b.getName());

    }
}

