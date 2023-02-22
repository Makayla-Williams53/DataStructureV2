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


}//end MainTest