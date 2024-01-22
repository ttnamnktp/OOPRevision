package decuong.quiz11;

public class Dolphin extends Creature implements Swimmable{
    private double weight;

    public Dolphin() {
    }

    public Dolphin(int age, String color, int number, double weight) {
        super(age, color, number);
        this.weight = weight;
    }

    @Override
    public void getRace() {
        System.out.println("Dolphin get race");
    }

    @Override
    public void display() {
        System.out.println("\nDolphin info:");
        super.display();
        System.out.println("Weight: " + weight);
    }

    public void swim(){
        System.out.println("Dolphin swims");
    }

    public void dive(){
        System.out.println("Dolphin dives");
    }
}
