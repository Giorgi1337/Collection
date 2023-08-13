package main.HashcodeAndequals;

import java.util.*;

public class Hashcodeequals {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1,"George");
        Person person2 = new Person(1,"George");

        map.put(person1,"123");
        map.put(person2,"123");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }
}

class Person {
    private int Id;
    private String name;

    public Person(int id, String name) {
        Id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Id == person.Id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}