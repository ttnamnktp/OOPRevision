package decuong.quiz20;

abstract class M {
    int i;
    public M(int i){
        this.i = i--;
    }

    private int method(){
        return 1;
    }

}

class N extends M {
    public N(int i){
        super(i++);
        System.out.println(i);
    }

    private long method(){
        return 1;
    }

    public static void main(String[] args) {
        M n = new N(26);
    }
}
