/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SWH
 */
public class BSTsTest {
    
    public BSTsTest() {
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

    /**
     * Test of postorder method, of class BSTs.
     */
    @Test
    public void testPostorder() {
        System.out.println("postorder");
        BSTs instance = new BSTs();
        instance.postorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inorder method, of class BSTs.
     */
    @Test
    public void testInorder() {
        System.out.println("inorder");
        BSTs instance = new BSTs();
        instance.inorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preorder method, of class BSTs.
     */
    @Test
    public void testPreorder() {
        System.out.println("preorder");
        BSTs instance = new BSTs();
        instance.preorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class BSTs.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BSTs instance = new BSTs();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchNode method, of class BSTs.
     */
    @Test
    public void testSearchNode() {
        System.out.println("searchNode");
        BSTs instance = new BSTs();
        boolean expResult = false;
        boolean result = instance.searchNode(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertNode method, of class BSTs.
     */
    @Test
    public void testInsertNode() {
        System.out.println("insertNode");
        Object data = null;
        BSTs instance = new BSTs();
        instance.insertNode(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BSTs.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        BSTs instance = new BSTs();
        instance.remove(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMax method, of class BSTs.
     */
    @Test
    public void testFindMax() {
        System.out.println("findMax");
        BSTs instance = new BSTs();
        node expResult = null;
        node result = instance.findMax(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNode method, of class BSTs.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        Object data = null;
        BSTs instance = new BSTs();
        instance.deleteNode(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printBST method, of class BSTs.
     */
    @Test
    public void testPrintBST() {
        System.out.println("printBST");
        BSTs instance = new BSTs();
        instance.printBST();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printfun method, of class BSTs.
     */
    @Test
    public void testPrintfun() {
        System.out.println("printfun");
        BSTs instance = new BSTs();
        instance.printfun(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
