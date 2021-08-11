package pq2;

import java.util.Scanner;
/*
Khoa Vu
30039608
11/08/2021
*/
public class PQ2 {


    public static void main(String[] args) {

        String[] names = {"AA", "CC", "BB", "ZZ", "OO", "II", "UU", "FF", "QQ", "EE"};
        BinaryTree tree = new BinaryTree();
        for (String n : names) {
            tree.add(n);
        }
        Scanner sc = new Scanner(System.in);
        tree.root = tree.buildTree(tree.root);
        System.out.println("Preorder traversal of balanced BST is :");
        tree.preOrder(tree.root);
        System.out.println("\nOrder traversal of balanced BST is :");
        tree.traverseInOrder(tree.root);
        System.out.println("\nDeleting a node");
        tree.delete("BB");
        System.out.println("\nPreorder traversal of balanced BST is :");
        tree.preOrder(tree.root);
        System.out.println("\nOrder traversal of balanced BST is :");
        tree.traverseInOrder(tree.root);
        System.out.println("\nEnter in to search");
        String input2 = sc.next();
        System.out.println(tree.containsNode(input2));
    }

}
