package draft.test1;

public class A extends ABC {
    private int o;

    public void firstMethod(String b) {
        System.out.println("this is from interface method 2");
    }

    public void firstMethod(String b, int a) {
        System.out.println("this is from interface method 3");
    }
    public void AMethod(String b, int a) {
        System.out.println("this is from method A");
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }

}
