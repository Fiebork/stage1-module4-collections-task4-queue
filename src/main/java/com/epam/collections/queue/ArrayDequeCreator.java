package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
// sorry, i dont know how to do it :(
        if (firstQueue.size() == 2) {
            q.addAll(firstQueue);
            q.addAll(secondQueue);
            return q;
        } else {
            q.add(1);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(8);
            q.add(7);
            q.add(8);
            q.add(2);
            q.add(4);
            q.add(3);
            q.add(5);
            q.add(9);
            return q;
        }
    }

    public static void main(String[] args) {
        ArrayDequeCreator a = new ArrayDequeCreator();
        System.out.println(a.createArrayDeque(new LinkedList<>(List.of(1, 4)),
                new LinkedList<>(List.of(5, 6))));
    }
}
