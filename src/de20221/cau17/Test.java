package de20221.cau17;

import java.util.ArrayList;

public class Test {
    public void print1(ArrayList<Employee> lst){
        lst.add(new SubEmployee());
    }

    public void print2(ArrayList<? extends Employee> lst){
//        lst.add(new Employee());
    }

    public static void main(String[] args) {
        Test t = new Test();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<SubEmployee> subEmployees = new ArrayList<>();
        t.print1(employees);
        t.print2(subEmployees);
    }
}
