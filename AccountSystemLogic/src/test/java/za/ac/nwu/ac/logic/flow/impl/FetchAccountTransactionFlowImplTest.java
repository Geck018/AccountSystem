package za.ac.nwu.ac.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FetchAccountTransactionFlowImplTest
{
    private FetchAccountTransactionFlowImpl classToTest;
    @Before
    public void setUp() throws Exception
    {
        classToTest = new FetchAccountTransactionFlowImpl(null);
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