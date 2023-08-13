package main.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("frog");
        animals.add("cat");
        animals.add("dog123");
        animals.add("bigbird");

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()){
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(animals);

        List<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(3);
        number.add(15);
        number.add(12);
        number.add(6);

        Collections.sort(number, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(number);

        List<Person> people = new ArrayList<>();
        people.add(new Person(3,"Geroge"));
        people.add(new Person(2,"Mike"));
        people.add(new Person(1,"Ann"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()){
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(people);
    }
}

//class StringLengthComparator implements Comparator<String> {
//    @Override
//    public int compare(String o1, String o2) {
//        if (o1.length() < o2.length()){
//            return 1;
//        } else if (o1.length() > o2.length()) {
//            return -1;
//        } else {
//            return 0;
//        }
        /*
          o1 > o2 => 1
          o1 < o2 => -1
          o1 == o2 => 0
         */
//    }
//}


//class BackwardsIntegerComparator implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if (o1 > o2){
//            return -1;
//        } else if (o1 < o2) {
//            return 1;
//        }else {
//            return 0;
//        }
//    }
//}

class Person {
    private int Id;
    private String name;

    public Person(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
