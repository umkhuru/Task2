package com.ethan.project2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class NotNullTest {

    @Before
    public void before()
    {
    }
    @Test
    public void testNotNull( )
    {
        System.out.println( "Chapter 2 - Not Null");
        NotNull test = new NotNull( );
        Assert.assertNotNull(test.notnull("My Name Is - What!!"));
    }
    @After
    public void after()
    {
        System.out.println( " NotNull is working");
    }
}
