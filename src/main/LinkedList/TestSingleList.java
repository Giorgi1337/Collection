package main.LinkedList;

public class TestSingleList {
    public static void main(String[] args) {
        MyLinkedSingleList myLinkedList = new MyLinkedSingleList();
        myLinkedList.add(2);
        myLinkedList.add(4);
        myLinkedList.add(10);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}
