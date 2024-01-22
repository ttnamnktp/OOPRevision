package decuong.quiz13;

public class Workout {
    public static void main(String[] args) {
        workHard();
        System.out.println("Nap time!");
    }

    private static void workHard(){
        try {
            workHard();
        } finally {
            workHard();
        }
    }
}
