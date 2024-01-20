package decuong.quiz8;

public class MyClass {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.max(13,29));
    }
}

class A{
    int max(int x, int y){
        if(x>y) return x;
        return y;
    }
}

class B extends A{
    @Override
    int max(int x, int y) {
        return super.max(x, y) - 10;
    }
}

class C extends B {
    @Override
    int max(int x, int y) {
        return super.max(x+10, y+10);
    }
}
