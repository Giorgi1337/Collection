package main.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueMain {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<>(3);
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));
        System.out.println(people.offer(person2));

        System.out.println(people);
    }
}

class Person {
    private int id;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

    public Person(int id) {
        this.id = id;
    }
}
