import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //AddRoot tests
    //tests to see if the add root method works with a single rood being added
    @Test
    public void addRootPass()
    {
        Tree myTree = new Tree();
        myTree.addRoot(0);
        assertTrue(myTree.getValue(myTree.getRoot()) == 0);
    }//end addRootPass

    //Test to see if the add root method keeps the original root if multiple are added
    @Test
    public void addTwoRootsPass()
    {
        Tree myTree = new Tree();
        myTree.addRoot(0);
        myTree.addRoot(100000);
        assertTrue(myTree.getValue(myTree.getRoot()) == 0);
    }//end addTwoRootsPass

    //Test to see if a second root is added if it keeps the value of the new root
    @Test
    public void addTwoRootsFail()
    {
        Tree myTree = new Tree();
        myTree.addRoot(0);
        myTree.addRoot(1000);
        assertTrue(myTree.getValue(myTree.getRoot()) != 1000);
    }//end addTwoRootsFail

    //add row tests
    @Test
    public void addRowPass()
    {
        Tree myTree = new Tree();
        myTree.addRoot(51);
        myTree.addRow();
        assertTrue(myTree.getTreeValues(myTree.getRoot()).matches("1 51 2 "));
    }//end addRowPass

    @Test
    void addTwoRowsPass()
    {
        Tree myTree = new Tree();
        myTree.addRoot(34);
        myTree.addRow();
        myTree.addRow();
        assertTrue(myTree.getTreeValues(myTree.getRoot()).matches("3 1 4 34 5 2 6 "));
    }//end addTwoRowsPass

    @Test
    void addThreeRowsFail()
    {
        Tree myTree = new Tree();
        myTree.addRoot(103);
        myTree.addRow();
        myTree.addRow();
        myTree.addRow();
        assertTrue(myTree.getTreeValues(myTree.getRoot()).matches("1 2 3 4 4 5 6 7 8 9 10 11 12 13 14 103 ") == false);
    }//end addThreeRowsFail

    //delete tests
    @Test
    void deleteRowPass()
    {
        Tree myTree = new Tree();
        myTree.addRoot(12);
        myTree.addRow();
        myTree.addRow();
        myTree.addRow();
        myTree.deleteRow(myTree.getRoot());
        assertTrue(myTree.getTreeValues(myTree.getRoot()).matches("3 1 4 12 5 2 6 "));
    }//end deleteRowPass

    @Test
    void deleteTwoRowsPass()
    {
        Tree myTree = new Tree();
        myTree.addRoot(62);
        myTree.addRow();
        myTree.addRow();
        myTree.addRow();
        myTree.deleteRow(myTree.getRoot());
        myTree.deleteRow(myTree.getRoot());
        assertTrue(myTree.getTreeValues(myTree.getRoot()).matches("1 62 2 "));
    }//deleteTwoRowsPass

    @Test
    void deleteAllRowsPass()
    {
        Tree myTree = new Tree();
        myTree.addRoot(875);
        myTree.deleteRow(myTree.getRoot());
        assertTrue(myTree.getTreeValues(myTree.getRoot()).matches(""));
    }

}//end MainTest