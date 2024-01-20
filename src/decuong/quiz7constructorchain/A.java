package decuong.quiz7constructorchain;

public class A {
    A() {
        this("1", "2");
        System.out.println("Default A()");

    }

    A(String s1, String s2) {
        this(s1 + s2);
        System.out.println("Default A(s1,s2)");

    }

    A(String s) {
        System.out.println(s);
        System.out.println("Default A(s)");

    }

    public static void main(String[] args) {
        new B();
    }
}

class B extends A {
    B() {
        super("ii");
        System.out.println("Default B()");

    }

    B(String s1, String s2) {
        this(s1 + s2);
        System.out.println("Default B(s1,s2)");
    }

    B(String s) {
        System.out.println("Default B(s)");
        System.out.println(s);
    }
}

