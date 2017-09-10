package com.chtuqu.spring_in_action.ch3.scope;

import com.chtuqu.spring_in_action.ch3.MyComponent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScopeConfig.class)
public class ScopeTest {

    @Autowired
    @Qualifier("singleton")
    private MyComponent single1;

    @Autowired
    @Qualifier("singleton")
    private MyComponent single2;

    @Autowired
    @Qualifier("prototype1")
    private MyComponent proto1;

    @Autowired
    @Qualifier("prototype2")
    private MyComponent proto2;

    @Test
    public void singleton() {
        Assert.assertEquals("singleton", single1.getName());
        Assert.assertEquals("singleton", single2.getName());
        Assert.assertEquals("prototype1", proto1.getName());
        Assert.assertEquals("prototype2", proto2.getName());

        Assert.assertTrue(single1 == single2);
        Assert.assertTrue(proto1 != proto2);
        Assert.assertTrue(single1 != proto1);
        Assert.assertTrue(single1 != proto2);
    }
}
