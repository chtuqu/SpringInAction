package com.chtuqu.spring_in_action.ch3.ambiguity;

import com.chtuqu.spring_in_action.ch3.MyComponent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = QualifierConfig.class)
public class QualifierTest {

    @Autowired
    @Qualifier("general")
    private MyComponent generalComp;

    @Autowired
    @Qualifier("custom")
    private MyComponent customComp;

    @Autowired
    @QualifierAnnotation
    @Qualifier("first")
    private MyComponent multiple1;

    @Autowired
    @QualifierAnnotation
    @Qualifier("second")
    private MyComponent multiple2;

    @Test
    public void defaultQualifier() {
        Assert.assertNotNull(generalComp);
        Assert.assertEquals("general", generalComp.getName());
    }

    @Test
    public void customQualifier() {
        Assert.assertNotNull(customComp);
        Assert.assertEquals("custom", customComp.getName());
    }

    @Test
    public void multipleQualifiers1() {
        Assert.assertNotNull(multiple1);
        Assert.assertEquals("multiple qualifiers x first", multiple1.getName());
    }

    @Test
    public void multipleQualifiers2() {
        Assert.assertNotNull(multiple2);
        Assert.assertEquals("multiple qualifiers x second", multiple2.getName());
    }

}
