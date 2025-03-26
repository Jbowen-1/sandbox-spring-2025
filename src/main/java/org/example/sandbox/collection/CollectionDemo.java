package org.example.sandbox.collection;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        set.add("Hi");
        set.add("Hi");
        set.add("Hi");
        set.add("Hello");
        set.add("Hi");
        set.add("Hi");

        set2.add("Hi");
        set2.add("Hi");
        set2.add("Hi");
        set2.add("Hello");
        set2.add("Hi");
        set2.add("Hi");


        System.out.println("Set: " + set);
        System.out.println("Set size: " + set.size());
        System.out.println("Set2: " + set2);

        Set<String> set3 = new TreeSet<>();

        set3.add("Hi");
        set3.add("Hi");
        set3.add("Hi");
        set3.add("Hello");
        set3.add("Hi");
        set3.add("Hi");

        System.out.println("Set3: " + set3);

        List<String> list = new ArrayList<>();
        List<String> list2 = new Vector<>();


        List<String> list3 = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        Deque<String> deque = new LinkedList<>();

        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Hi");
        priorityQueue.add("Howdy");
        priorityQueue.add("Hi");
        priorityQueue.remove("Hi");

        System.out.println("Priority Queue: " + priorityQueue);




    }
}
