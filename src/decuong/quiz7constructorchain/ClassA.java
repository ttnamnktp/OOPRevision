package decuong.quiz7constructorchain;

class ClassA  extends ClassX {
    public ClassA(){
        this(19);
    }

    public ClassA(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        new ClassA();
    }
}

class ClassX {
    public ClassX(){
        System.out.println("Class X");
    }
}
