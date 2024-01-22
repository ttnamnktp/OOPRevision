package decuong.quiz10;

public class A {
    int i = 10;
    public void print(int x, String a){
        System.out.println("A method");
    }
}

class B extends A {
    int i = 20;
    public void print(){
        System.out.println("overrided by B method");
    }
    public void print(String b){
        System.out.println("B method");
    }
}

class Test {
    public static void main(String[] args) {
        B a = new B();
        System.out.println(a.i);
        a.print();
    }
}
