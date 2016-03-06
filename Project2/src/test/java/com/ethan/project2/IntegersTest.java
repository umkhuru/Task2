package com.ethan.project2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class IntegersTest {

    @Before
    public void before()
    {
    }
    @Test
    public void testInteger( )
    {
        System.out.println( "Chapter 2 - Integer ");
        Integers test = new Integers( );
        Assert.assertEquals(3, test.integers(9, 6), 1);
    }
    @After
    public void after()
    {
        System.out.println( "Integers is working");
    }
}
