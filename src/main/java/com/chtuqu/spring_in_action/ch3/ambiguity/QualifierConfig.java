package com.chtuqu.spring_in_action.ch3.ambiguity;

import com.chtuqu.spring_in_action.ch3.MyComponent;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QualifierConfig {

    @Bean
    public MyComponent general() {
        return new MyComponent("general");
    }

    @Bean
    @Qualifier("custom")
    public MyComponent another() {
        return new MyComponent("custom");
    }

    @Bean
    @QualifierAnnotation
    @Qualifier("first")
    public MyComponent multipleQualifiers1() {
        return new MyComponent("multiple qualifiers x first");
    }

    @Bean
    @QualifierAnnotation
    @Qualifier("second")
    public MyComponent multipleQualifiers2() {
        return new MyComponent("multiple qualifiers x second");
    }

}
