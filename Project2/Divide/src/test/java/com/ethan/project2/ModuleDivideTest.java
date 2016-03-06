package com.ethan.project2;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class ModuleDivideTest extends TestCase{

    ModuleDivide div = new ModuleDivide();

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void testDivide()
    {
        Assert.assertEquals(0, div.division());
    }
    @After
    public void tearDown() throws Exception {
    }
}
