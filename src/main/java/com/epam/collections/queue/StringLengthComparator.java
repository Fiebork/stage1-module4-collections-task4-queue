package com.epam.collections.queue;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y) {
        //return x.toLowerCase().compareTo(y.toLowerCase());
        int i = x.compareTo(y);
        if(i != 0) return -i;
        return x.compareTo(y);
    }
}
