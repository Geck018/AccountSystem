//This class is a unit test class, testing its relevant flow implementation

package za.ac.nwu.ac.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddAccountTransactionMilesFlowImplTest {

    private AddAccountTransactionMilesFlowImpl classToTest;
    @Before
    public void setUp() throws Exception
    {
        classToTest = new AddAccountTransactionMilesFlowImpl(null);
    }

    @After
    public void tearDown() throws Exception
    {
        classToTest = null;
    }

    @Test
    public void methodToTest()
    {
        assertTrue(classToTest.methodToTest());
    }
}