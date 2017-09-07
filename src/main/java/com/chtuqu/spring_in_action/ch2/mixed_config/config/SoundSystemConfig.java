package com.chtuqu.spring_in_action.ch2.mixed_config.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(YellowSubmarineConfig.class)
@ImportResource("classpath:ch2/spring/mixed_config/disc-config.xml")
public class SoundSystemConfig {
}