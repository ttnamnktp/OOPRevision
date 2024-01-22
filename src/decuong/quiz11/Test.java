package decuong.quiz11;

public class Test {
    public static void main(String[] args) {
        Creature c1 = new Dolphin(10,"Blue",2,100.4);
        c1.display();
        c1.getRace();

        Dolphin d1 = (Dolphin) c1;
        d1.display();
        d1.swim();
    }
}
