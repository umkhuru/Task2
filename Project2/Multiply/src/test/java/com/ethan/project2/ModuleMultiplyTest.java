package com.ethan.project2;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class ModuleMultiplyTest extends TestCase{

    ModuleMultiply multi = new ModuleMultiply();

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void testMultiply()
    {
        org.junit.Assert.assertEquals(0, multi.multiply());
    }
    @After
    public void tearDown() throws Exception {
    }
}
