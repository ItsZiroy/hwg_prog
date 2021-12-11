package Algorithmen_und_Datenstrukturen.Aufgabe16;

import com.sun.source.tree.Tree;

public class BinarySearchTree {

    private class TreeNode {

        private int key;
        private TreeNode leftChild;
        private TreeNode rightChild;

        private TreeNode(int key) {
            this.key = key;
        }
    }

    private TreeNode root;

    public void insert(int key) {
        if(isEmpty()) {
            root = new TreeNode(key);
            return;
        }
        insert(this.root, key);
    }

    public void insert(TreeNode root, int key) {
        if(key < root.key) {
            if(root.leftChild == null) {
                root.leftChild = new TreeNode(key);
            } else {
                insert(root.leftChild, key);
            }
        }
        if (key > root.key) {
            if(root.rightChild == null) {
                root.rightChild = new TreeNode(key);
            } else {
                insert(root.rightChild, key);
            }
        }
    }


    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(int key) {
        TreeNode tempNode = root;
        while (tempNode != null) {
            if (key == tempNode.key) {
                return true;
            }
            if (key < tempNode.key) {
                tempNode = tempNode.leftChild;
            } else {
                tempNode = tempNode.rightChild;
            }
        }
        return false;
    }

    public void printInorder() {
        if (root != null) {
            printInorder(root);
            System.out.println();
        }
    }

    private void printInorder(TreeNode node) {
        if (node.leftChild != null) {
            printInorder(node.leftChild);
            System.out.print(", ");
        }

        System.out.print(node.key);

        if (node.rightChild != null) {
            System.out.print(", ");
            printInorder(node.rightChild);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        System.out.println("tree.isEmpty(): " + tree.isEmpty());

        System.out.println("Werte werden hinzugefügt.");

        tree.insert(1);
        tree.insert(9);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(0);

        System.out.println("tree.isEmpty(): " + tree.isEmpty());

        System.out.println("tree.contains(7) " + tree.contains(7));
        System.out.println("tree.contains(8) " + tree.contains(8));

        System.out.print("tree in Inorder: ");
        tree.printInorder();
    }
}
