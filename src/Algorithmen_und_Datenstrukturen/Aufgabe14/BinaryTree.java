package Algorithmen_und_Datenstrukturen.Aufgabe14;

public class BinaryTree<T> {

    private class TreeNode {

        private T key;
        private TreeNode leftChild;
        private TreeNode rightChild;

        private TreeNode(T key) {
            this.key = key;
        }
    }

    private final TreeNode root;

    public BinaryTree(T key) {
        root = new TreeNode(key);
    }

    public static <T> BinaryTree<T> combine(BinaryTree<T> leftTree, T key, BinaryTree<T> rightTree) {
        BinaryTree<T> tree = new BinaryTree<T>(key);
        if (leftTree != null) {
            tree.root.leftChild = leftTree.root;
        }
        if (rightTree != null) {
            tree.root.rightChild = rightTree.root;
        }
        return tree;
    }

    public void printInorder() {
        printInorder(root);
        System.out.println();
    }

    private void printInorder(TreeNode node) {
        // (1) gib linken Teilbaum aus
        if (node.leftChild != null) {
            printInorder(node.leftChild);
            System.out.print(", ");
        }

        // (2) gib Wurzel aus
        System.out.print(node.key);

        // (3) gib rechten Teilbaum aus
        if (node.rightChild != null) {
            System.out.print(", ");
            printInorder(node.rightChild);
        }
    }

    public void printPreorder() {
        printPreorder(root);
        System.out.println();
    }
    private void printPreorder(TreeNode node) {
        System.out.print(node.key);
        if (node.leftChild != null) {
            System.out.print(", ");
            printPreorder(node.leftChild);
        }

        if (node.rightChild != null) {
            System.out.print(", ");
            printPreorder(node.rightChild);
        }
    }

    public void printPostorder() {
        printPostorder(root);
        System.out.println();
    }
    private void printPostorder(TreeNode node) {
        if (node.leftChild != null) {
            printPostorder(node.leftChild);
            System.out.print(", ");
        }
        if (node.rightChild != null) {
            printPostorder(node.rightChild);
            System.out.print(", ");
        }
        System.out.print(node.key);
    }

    public static void main(String[] args) {
        BinaryTree<String> leftTree = new BinaryTree<String>("L");
        BinaryTree<String> rightTree = new BinaryTree<String>("R");

        BinaryTree<String> tree = combine(leftTree, "W", rightTree);

        tree.printInorder();
        tree.printPreorder();
        tree.printPostorder();

    }
}
