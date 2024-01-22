package de20221.cau18;

public class Test {
    public static void increase(Person p) {
        p.setAge(p.getAge() + 1);
    }

    public static void swap(Person p1, Person p2) {
        Person tmp = p1;
        p1 = p2;
        p2 = p1;
    }

    public static void main(String[] args) {
        Person p1 = new Person(15);
        Person p2 = new Person(20);
        increase(p1);
        swap(p1,p2);
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
