package dev.tree;

public class Tester {
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.add(5);
        bt.add(3);
        bt.add(8);
        bt.add(1);
        bt.add(2);
        bt.add(4);

        System.out.println(bt.findElement(3));
    }
}
