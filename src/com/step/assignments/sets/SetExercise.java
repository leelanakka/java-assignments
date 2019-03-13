package com.step.assignments.sets;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {

    public Set<Integer> set1 = new HashSet<>();
    public Set<Integer> set2 = new HashSet<>();

    public SetExercise(Set<Integer> set1, Set<Integer> set2) {
        this.set1 = set1;
        this.set2 = set2;
    }

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(2);
        b.add(3);
        b.add(4);

        SetExercise setExercise = new SetExercise(a, b);

        System.out.println(setExercise.unionOfSet());
        System.out.println(setExercise.interSection());
    }

    public Set unionOfSet() {
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public Set interSection() {
        Set<Integer> interSection = new HashSet<>();
        for (int number : set1) {
            if (set2.contains(number)) {
                interSection.add(number);
            }
        }
        return interSection;
    }

}
