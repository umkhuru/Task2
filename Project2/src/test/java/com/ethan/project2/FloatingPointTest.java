package com.ethan.project2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class FloatingPointTest {

    @Before
    public void before()
    {
    }
    @Test
    public void testFloatingPoint( )
    {
        System.out.println( "Chapter 2 - Floating Point ");
        FloatingPoint test = new FloatingPoint( );
        Assert.assertEquals(16, test.floatPoint(4, 4), 1);
    }
    @After
    public void after()
    {
        System.out.println( "FloatingPoint is working");
    }
}
