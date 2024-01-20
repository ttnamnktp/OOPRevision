package decuong.quiz7constructorchain;

public class M {
    int i;
    public M(int i){
        this.i = i--;
    }
}

class N  extends M{
    public N(int i){
        super(++i);
        System.out.println(this.i);
    }
}

class Test{
    public static void main(String[] args) {
        new N(26);
    }
}
