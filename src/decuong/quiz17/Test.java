package decuong.quiz17;

public class Test {
    static int x = 11;
    private int y = 33;
    public void medthod1(int x){
        Test m = new Test();
        this.x = 22;
        y = 44;
        System.out.println(Test.x);
        System.out.println(m.x);
        System.out.println(m.y);
        System.out.println(y);
    }

    public int getY() {
        return y;
    }
}

class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.medthod1(5);
        System.out.println(t.getY());
    }
}
