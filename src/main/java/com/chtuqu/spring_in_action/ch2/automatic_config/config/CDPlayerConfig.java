package com.chtuqu.spring_in_action.ch2.automatic_config.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.chtuqu.spring_in_action.ch2.automatic_config.soundsystem.PackageMarker;

@Configuration
@ComponentScan(basePackageClasses = PackageMarker.class)
public class CDPlayerConfig {
}
