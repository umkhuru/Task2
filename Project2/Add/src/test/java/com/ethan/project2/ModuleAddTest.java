package com.ethan.project2;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by student on 2016/03/03.
 */
public class ModuleAddTest extends TestCase{

    ModuleAdd add = new ModuleAdd();


    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void testAdd()
    {
        Assert.assertEquals(5,add.add());
    }
    @After
    public void tearDown() throws Exception {
    }
}
