package main.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        for ( int i = 0; i < 10; i++){
            List.add(i);
        }
        List.remove(5);
        System.out.println(List);
    }
}

