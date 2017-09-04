package com.chtuqu.spring_in_action.ch1.knights.main;

import com.chtuqu.spring_in_action.ch1.knights.config.KnightConfig;
import com.chtuqu.spring_in_action.ch1.knights.entities.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
