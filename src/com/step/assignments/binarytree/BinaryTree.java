package com.step.assignments.binarytree;

import java.util.HashMap;
import java.util.Map;

public class BinaryTree {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        int[] list = {1,4};
        BinaryTree binaryTree = new BinaryTree(3);
        Object values = binaryTree.finalBinaryTree(list);
        String output =  values.toString();
        System.out.println(output);
    }

    Map<String, BinaryTree> tree = new HashMap<String, BinaryTree>();
    private int node;

    public BinaryTree(int node) {
        this.node = node;
    }

    public String selectBranch(int number) {
        return number < this.node ? "left" : "right";
    }

    public Map insert(int number) {
        String branch = this.selectBranch(number);
        if (tree.get(branch) == null) {
            tree.put(branch, new BinaryTree(number));
            return tree;
        }
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
