package main;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("George");
        employees.add("Anna");
        employees.add("John");
        employees.add("Zurab");
        employees.add("Merab");

        employees.remove("Anna");

        for (int i = 0; i < employees.getSize(); i++) {
               System.out.println(employees.get(i));
        }
    }
}