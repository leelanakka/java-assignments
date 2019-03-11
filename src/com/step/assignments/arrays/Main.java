package com.step.assignments.arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        ListIterator listIterator = new ListIterator(integers);
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.hasNext());

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());


        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        listIterator.next();
    }
}
