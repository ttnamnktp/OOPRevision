package decuong.quiz24;

public class Person implements Printable{
    public String name;

    @Override
    public String stringify() {
        return name;
    }

    public static void main(String[] args) {
        Printable p1 = new Person();
        String name = p1.stringify();
    }
}
