package decuong.quiz11;

public class Eagle extends Creature implements Flyable {
    private double lengthOfWing;

    public Eagle() {
    }

    public Eagle(int age, String color, int number, double lengthOfWing) {
        super(age, color, number);
        this.lengthOfWing = lengthOfWing;
    }

    @Override
    public void getRace() {
        System.out.println("Eagle get race");
    }

    @Override
    public void display() {
        System.out.println("\nEagle info:");
        super.display();
        System.out.println("Length of wing: " + lengthOfWing);
    }

    public void fly(){
        System.out.println("Eagle fly");
    }

    public void soar(){
        System.out.println("Eagle soar");
    }

}
