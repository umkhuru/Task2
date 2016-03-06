package com.ethan.project2;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class ModuleSubtractTest extends TestCase {

    ModuleSubtract sub = new ModuleSubtract();

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void testSubtraction()
    {
        Assert.assertEquals(-5, sub.subtraction());
    }
    @After
    public void tearDown() throws Exception {
    }
}
