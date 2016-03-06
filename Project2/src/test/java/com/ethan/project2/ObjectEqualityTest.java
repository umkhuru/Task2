package com.ethan.project2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class ObjectEqualityTest {

    @Before
    public void before()
    {
    }
    @Test
    public void testObjectEquality( )
    {
        System.out.println( "Chapter 2 - Object Equality");
        ObjectEquality ob1 = new ObjectEquality( );
        ObjectEquality ob2 = new ObjectEquality( );
        Assert.assertSame(ob1, ob1);
    }
    @After
    public void after()
    {
        System.out.println( " ObjectEquality is working");
    }
}
