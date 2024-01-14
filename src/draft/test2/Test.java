package draft.test2;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new BigDog();
        Dog dog1 = (Dog)animal1;
        dog1.greeting();
        animal1.greeting();
        BigDog bigdog1 = (BigDog) animal1;
        dog1.greeting(bigdog1);
        bigdog1.greeting();
    }
}
