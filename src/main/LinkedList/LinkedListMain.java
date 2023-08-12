package main.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        List<Integer> linkdList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkdList);
        measureTime(arrayList);
    }
    private  static void measureTime(List<Integer> list){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            list.add(0,i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
