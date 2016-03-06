package com.ethan.project2;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;

/**
 * Created by student on 2016/03/03.
 */
public class DisableTest {

    @Before
    public void before()
    {
    }
    @Ignore
    public void testDisabling( )
    {
        System.out.println( "Chapter 2 - Test Disabling");
        Disabling test = new Disabling( );
        test.dis( 4 );
    }
    @After
    public void after()
    {
        System.out.println( "Disabling is working");
    }
}
