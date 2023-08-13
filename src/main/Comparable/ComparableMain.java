package main.Comparable;

import java.util.*;

public class ComparableMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(personList);
        addElements(peopleSet);

        Collections.sort(personList);

        System.out.println(personList);
        System.out.println(peopleSet);
    }
    private static void addElements(Collection collection) {
        collection.add(new Person(1,"George"));
        collection.add(new Person(4,"John"));
        collection.add(new Person(2,"Ann"));
        collection.add(new Person(3,"Elena"));
    }
}

class Person implements Comparable<Person>{
    private int id;
    private String name;
    public Person(int in, String name) {
        this.id = in;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "in=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    @Override
    public int compareTo(Person o) {
        if (this.name.length() > o.getName().length()){
            return 1;
        }else if(this.name.length() < o.getName().length()){
            return -1;
        }else {
            return 0;
        }
    }
}
