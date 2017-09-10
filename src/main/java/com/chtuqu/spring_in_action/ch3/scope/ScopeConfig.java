package com.chtuqu.spring_in_action.ch3.scope;

import com.chtuqu.spring_in_action.ch3.MyComponent;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class ScopeConfig {

    @Bean
    public MyComponent singleton() {
        return new MyComponent("singleton");
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MyComponent prototype1() {
        return new MyComponent("prototype1");
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MyComponent prototype2() {
        return new MyComponent("prototype2");
    }
}
