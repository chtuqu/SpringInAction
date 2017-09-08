package com.chtuqu.spring_in_action.ch3.environment_profiles;

import com.chtuqu.spring_in_action.ch3.MyComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class EnvConfig {

    @Bean
    @Profile("dev")
    public MyComponent component1() {
        return new MyComponent("dev bean");
    }

    @Bean
    @Profile("prod")
    public MyComponent component2() {
        return new MyComponent("prod bean");
    }
}
