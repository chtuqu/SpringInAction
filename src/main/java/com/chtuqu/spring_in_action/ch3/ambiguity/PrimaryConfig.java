package com.chtuqu.spring_in_action.ch3.ambiguity;

import com.chtuqu.spring_in_action.ch3.MyComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryConfig {

    @Bean
    public MyComponent general() {
        return new MyComponent("general");
    }

    @Bean
    @Primary
    public MyComponent primary() {
        return new MyComponent("primary");
    }

}
