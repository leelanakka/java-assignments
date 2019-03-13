package com.step.assignments.binarytree;

import java.util.HashMap;
import java.util.Map;

public class BinaryTree {
    Map<String, BinaryTree> tree = new HashMap<String, BinaryTree>();
    private int node;

    public BinaryTree(int node) {
        this.node = node;
    }

    public static void main(String[] args) {
        int[] list = {1, 4, 2, 3, 9, 10, -1, -1};
        BinaryTree binaryTree = new BinaryTree(3);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String selectBranch(int number) {
        return number < this.node ? "left" : "right";
    }

    public Map insert(int number) {
        String branch = this.selectBranch(number);
        System.out.println(tree.get(branch));
        if (tree.get(branch) == null) {
            tree.put(branch, new BinaryTree(number));
            System.out.println("branch is " + branch + "number is  " + number);
            return tree;
        }
        System.out.println("branch is " + branch + " and number is  " + number);
        tree.get(branch).insert(number);
        return tree;
    }


    public Map finalBinaryTree(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            this.insert(numbers[i]);
        }
        return tree;
    }
}
