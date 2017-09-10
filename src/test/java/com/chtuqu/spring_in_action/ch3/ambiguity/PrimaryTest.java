package com.chtuqu.spring_in_action.ch3.ambiguity;

import com.chtuqu.spring_in_action.ch3.MyComponent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// NOTE: uncomment Java or XML config below
@ContextConfiguration(classes = PrimaryConfig.class)
//@ContextConfiguration(locations = "classpath:ch3/primary-cfg.xml")
public class PrimaryTest {

    @Autowired
    private MyComponent myComponent;

    @Test
    public void noAmbiguityShouldOccur() {
        Assert.assertNotNull(myComponent);
        Assert.assertEquals("primary", myComponent.getName());
    }
}
