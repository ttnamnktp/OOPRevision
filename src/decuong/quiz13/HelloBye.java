package decuong.quiz13;

public class HelloBye {

    public static void main(String[] args) {
        helloBye();
    }

    static void helloBye(){
        try
        {
            System.out.println("Hello");
            System.exit(0);
        }
        finally {
            System.out.println("Bye");
        }
    }
}
