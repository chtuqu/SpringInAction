package com.chtuqu.spring_in_action.ch3.conditional;

import com.chtuqu.spring_in_action.ch3.MyComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfiguration {

    @Bean
    @CustomAnnotation
    @Conditional(CustomCondition.class)
    public MyComponent ifAnnotatedWithCustomAnnotation() {
        return new MyComponent("conditional");
    }
}
