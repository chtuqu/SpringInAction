package com.chtuqu.spring_in_action.ch3.conditional;

import com.chtuqu.spring_in_action.ch3.MyComponent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConditionalConfiguration.class)
public class ConditionalTest {

    @Autowired
    private MyComponent myComponent;

    @Test
    public void conditionMustBeSatisfied() {
        Assert.assertNotNull(myComponent);
        Assert.assertEquals("conditional", myComponent.getName());
    }
}
