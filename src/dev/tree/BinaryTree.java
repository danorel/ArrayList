package dev.tree;

public class BinaryTree<Integer>{

    private Node root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(int value){
        root = new Node(value);
    }

    public void add(int value){
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node node, int value){
        if(node == null){
            return new Node(value);
        }

        if(value < node.value){
            node.left = addRecursive(node.left, value);
        } else if(value > node.value){
            node.right = addRecursive(node.right, value);
        } else {
            return node;
        }

        return node;
    }

//    public void showBinaryTree(){
//        showRecursiveBinaryTree(root);
//    }
//
//    private Node showRecursiveBinaryTree(Node current_node){
//        if(current_node == null){
//            return current_node;
//        }
//
//        if(current_node > )
//
//        return current_node;
//    }

    public boolean findElement(int element){
        return RecursiveFindElement(root, element);
    }

    private boolean RecursiveFindElement(Node current_node, int value){
        if(current_node == null){
            return false;
        }

        if(current_node.value > value){
            RecursiveFindElement(current_node.right, value);
        } else if(current_node.value < value){
            RecursiveFindElement(current_node.left, value);
        } else {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(root.value);
    }

    private class Node {
        Node left;
        Node right;
        int value;

        public Node(int value){
            this.value = value;
            right = null;
            left = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }
}
