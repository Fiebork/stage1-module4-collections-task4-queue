package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        Comparator<String> comparator = new StringLengthComparator();
        PriorityQueue<String> q = new PriorityQueue<>(comparator);
        List<String> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        list.sort(comparator);

        q.addAll(list);

        return q;
    }
}

