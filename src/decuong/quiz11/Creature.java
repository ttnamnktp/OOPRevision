package decuong.quiz11;

public abstract class Creature {
    private int age;
    private String color;
    private int number;
    public abstract void getRace();

    public Creature() {
    }

    public Creature(int age, String color, int number) {
        this.age = age;
        this.color = color;
        this.number = number;
    }

    public void display(){
        System.out.println("\nAge: " + age + "\nColor: " + color + "\nNumber: " + number);
    }

}
