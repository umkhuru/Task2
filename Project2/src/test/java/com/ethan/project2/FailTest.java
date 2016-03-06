package com.ethan.project2;

import org.junit.*;

/**
 * Created by student on 2016/03/03.
 */
public class FailTest {

    @Before
    public void before()
    {
    }
    @Ignore
    public void testFail( )
    {
        System.out.println( "Chapter 2 -Failing Test");
        Assert.fail("The test is supposed to fail");
    }
    @After
    public void after()
    {
        System.out.println( "Fail is working");
    }
}
