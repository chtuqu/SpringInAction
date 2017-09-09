package com.chtuqu.spring_in_action.ch3.environment_profiles;

import com.chtuqu.spring_in_action.ch3.MyComponent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// NOTE: uncomment Java or XML config below
@ContextConfiguration(classes = EnvConfig.class)
//@ContextConfiguration(locations = "classpath:ch3/environment_profiles/env-config.xml")
@ActiveProfiles("dev")
public class EnvProfilesTest {

    @Autowired
    private MyComponent myComponent;

    @Test
    public void devBeanShouldBeWired() {
        Assert.assertNotNull(myComponent);
        Assert.assertEquals("dev bean", myComponent.getName());
    }

}
