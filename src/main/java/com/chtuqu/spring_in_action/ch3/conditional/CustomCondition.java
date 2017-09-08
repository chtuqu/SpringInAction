package com.chtuqu.spring_in_action.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class CustomCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return annotatedTypeMetadata.isAnnotated("com.chtuqu.spring_in_action.ch3.conditional.CustomAnnotation");
    }
}
