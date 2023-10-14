package linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeLast();
//        list.removeFirst();
//        System.out.println(list.indexOf(40));
        System.out.println(list.contains(10));
    }
}
