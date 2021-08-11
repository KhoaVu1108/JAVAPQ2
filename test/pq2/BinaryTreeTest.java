
package pq2;

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {
    
    public BinaryTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testStoreBSTNodes() {
        System.out.println("storeBSTNodes");
        Node root = null;
        Vector<Node> nodes = null;
        BinaryTree instance = new BinaryTree();
        instance.storeBSTNodes(root, nodes);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBuildTreeUtil() {
        System.out.println("buildTreeUtil");
        Vector<Node> nodes = null;
        int start = 0;
        int end = 0;
        BinaryTree instance = new BinaryTree();
        Node expResult = null;
        Node result = instance.buildTreeUtil(nodes, start, end);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBuildTree() {
        System.out.println("buildTree");
        Node root = null;
        BinaryTree instance = new BinaryTree();
        Node expResult = null;
        Node result = instance.buildTree(root);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPreOrder() {
        System.out.println("preOrder");
        Node node = null;
        BinaryTree instance = new BinaryTree();
        instance.preOrder(node);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTraverseInOrder() {
        System.out.println("traverseInOrder");
        Node node = null;
        BinaryTree instance = new BinaryTree();
        instance.traverseInOrder(node);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        String value = "KK";
        BinaryTree instance = new BinaryTree();
        instance.add(value);
        fail("The test case is a prototype.");
    }
    @Test
    public void testDelete() {
        System.out.println("delete");
        String value = "LL";
        BinaryTree instance = new BinaryTree();
        instance.delete(value);
        fail("The test case is a prototype.");
    }

    @Test
    public void testContainsNode() {
        System.out.println("containsNode");
        String value = "AA";
        BinaryTree instance = new BinaryTree();
        String expResult = "AA";
        String result = instance.containsNode(value);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
