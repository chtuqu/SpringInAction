package com.chtuqu.spring_in_action.ch2.java_config.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PlayerConfig.class, AlbumConfig.class})
public class CDPlayerConfig {
}
