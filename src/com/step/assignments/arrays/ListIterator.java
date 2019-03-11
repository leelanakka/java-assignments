package com.step.assignments.arrays;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {

    private List list;
    private int currentIndex = -1;

    public ListIterator(List list) {
        this.list = list;
    }

    public boolean hasNext() {
        if (this.list.size()-1 > this.currentIndex) {
            return true;
        }
        return false;
    }

    public int next() {
        if (hasNext()){
            this.currentIndex++;
            int value = (int) this.list.get(currentIndex);
            return value;
        }
        throw new NoSuchElementException();
    }
}

//Create A class called ListIterator
//    Takes a list as constructor parameter
//
//    method hasNext() tells if there are any more elements in the list which are not yet visited
//    method next()
//         - gives the next element if available
//         - throw new NoSuchElementException() when all elements are visited already
