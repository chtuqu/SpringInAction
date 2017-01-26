package ch2.mixed_config.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(YellowSubmarineConfig.class)
@ImportResource("classpath:spring/mixed_config/cd-config.xml")
public class SoundSystemConfig {
}