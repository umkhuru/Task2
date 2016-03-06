package com.ethan.project2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class ObjectIdentityTest {

    @Before
    public void before()
    {
    }
    @Test
    public void testObjectIdentity( )
    {
        System.out.println( "Chapter 2 - Object Identity ");
        ObjectIdentity oe1 = new ObjectIdentity( );
        ObjectIdentity oe2 = new ObjectIdentity( );
        Assert.assertNotSame(oe1, oe2);
    }
    @After
    public void after()
    {
        System.out.println( "ObjectIdentity is working");
    }
}
