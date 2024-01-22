package de20221.cau5;

public class Test {
    public static void main(String[] args) {
        B a = new B();
        System.out.println(a.i);
        a.print();
    }
}

class A {
    int i = 200;

    public void print(){
        System.out.println(200);
    }
}

class B extends A{
    int i = 100;
    public void print(){
        System.out.println(100);
    }
}
