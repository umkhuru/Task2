package com.ethan.project2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class TruthTest {

    @Before
    public void before()
    {
    }
    @Test
    public void testTruth( )
    {
        System.out.println( "Chapter 2 - Truth");
        Truth test = new Truth( );
        Assert.assertTrue("Is the statement true", test.truth(true));
    }
    @After
    public void after()
    {
        System.out.println( "Truth is working");
    }


}
