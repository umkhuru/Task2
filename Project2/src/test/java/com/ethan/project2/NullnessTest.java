package com.ethan.project2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class NullnessTest {

    @Before
    public void before()
    {
    }
    @Test
    public void testNullness( )
    {
        System.out.println( "Chapter 2 - Nullness" );
        Nullness test = new Nullness( );
        Assert.assertNull(test.nullness(null));
    }
    @After
    public void after()
    {
        System.out.println( "Nullness is working");
    }
}
