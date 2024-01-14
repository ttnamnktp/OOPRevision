package draft.test2;

public class Dog extends Animal {
    public void greeting(){
        System.out.println("Wooof");
    }

    public void greeting(Dog another){
        System.out.println("Wooof");
    }

    public static <E> E print(E[] a) {
        E e1 = null;
        for (E e : a) e1= e;
        return e1;
    }
}
