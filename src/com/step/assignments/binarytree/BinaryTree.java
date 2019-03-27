package com.step.assignments.binarytree;

public class BinaryTree {
    private BinaryTree left;
    private BinaryTree right;
    private int node;

    private BinaryTree(int node) {
        this.node = node;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 8, 4,99,10,22,33};
        BinaryTree binaryTree = new BinaryTree(3);
        System.out.println(binaryTree.finalBinaryTree(list));
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "left=" + left +
                ", right=" + right +
                ", node=" + node +
                '}';
    }

    private Direction selectBranch(int number) {
        return number < this.node ? Direction.LEFT : Direction.RIGHT;
    }

    private void insert(int number) {
        Direction branch = this.selectBranch(number);
        if (this.left == null && branch.equals(Direction.LEFT)) {
            this.left = new BinaryTree(number);
            return;
        }

        if (this.right == null && branch.equals(Direction.RIGHT)) {
            this.right = new BinaryTree(number);
            return;
        }
        if (branch.equals(Direction.LEFT)) {
            this.left.insert(number);
            return;
        }

        this.right.insert(number);
    }


    private BinaryTree finalBinaryTree(int[] numbers) {
        for (int number : numbers) {
            this.insert(number);
        }
        return this;
    }
}
