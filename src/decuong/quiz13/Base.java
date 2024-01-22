package decuong.quiz13;

public class Base extends Exception {
}

class Derived extends Base {
}

class Test {
    public static void main(String[] args) {
        try {
            throw new Derived();
        } catch (Base b) {
            System.out.println("Catch base exception");
        }
//        catch (Derived d){
//            System.out.println("Catch derived exception");
//        }
    }
}
