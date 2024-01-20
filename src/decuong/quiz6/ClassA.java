package decuong.quiz6;

class ClassA {
    public ClassA(){
        System.out.println("Class A");
    }

    public static void main(String[] args) {
        ClassA a = new ClassC();
    }
}

class ClassB extends ClassA {
    public ClassB(){
        System.out.println("Class B");
    }
}

class ClassC extends ClassB {
    public ClassC(){
        System.out.println("Class C");
    }
}

