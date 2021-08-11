package pq2;

import java.util.Vector;

public class BinaryTree {

    Node root;

    public void storeBSTNodes(Node root, Vector<Node> nodes) {
        if (root == null) {
            return;
        }
        storeBSTNodes(root.left, nodes);
        nodes.add(root);
        storeBSTNodes(root.right, nodes);
    }

    Node buildTreeUtil(Vector<Node> nodes, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node node = nodes.get(mid);
        node.left = buildTreeUtil(nodes, start, mid - 1);
        node.right = buildTreeUtil(nodes, mid + 1, end);
        return node;
    }

    Node buildTree(Node root) {
        Vector<Node> nodes = new Vector<Node>();
        storeBSTNodes(root, nodes);
        int n = nodes.size();
        return buildTreeUtil(nodes, 0, n - 1);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    public void add(String value) {

        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, String data) {
        if (current == null) {
            return new Node(data);
        }

        if (data.compareTo(current.data) < 0) {
            current.left = addRecursive(current.left, data);
        } else if (data.compareTo(current.data) > 0) {
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    private Node deleteRecursive(Node current, String value) {
        if (current == null) {
            return null;
        }

        if (value == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            String smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value.compareTo(current.data) < 0) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private String findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);

    }

    public void delete(String value) {
        root = deleteRecursive(root, value);
    }

    private String containsNodeRecursive(Node current, String data) {
        if (current == null) {
            return "Not Found";
        }
        if (data.compareTo(current.data) == 0) {
            return "Found";
        }
        return data.compareTo(current.data) < 0
                ? containsNodeRecursive(current.left, data)
                : containsNodeRecursive(current.right, data);
    }

    public String containsNode(String value) {
        return containsNodeRecursive(root, value);
    }

}
