package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List <Integer> dishes = new ArrayList<>();
        List <Integer> output = new ArrayList<>();

        if (numberOfDishes == 0) {
            return dishes;
        }

        dishes.add(0);
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        int i = 0;
        while (output.size() != dishes.size() - 1) {
            for (int j = 0; j < everyDishNumberToEat; j++) {
                i++;
                if (i >= dishes.size()) {
                    i = 1;
                }
                while (output.contains(dishes.get(i))) {
                    if (i + 1 >= dishes.size()) {
                        i = 1;
                    } else {
                        i++;
                    }
                }
            }
            output.add(dishes.get(i));
        }

        return output;
    }
}
