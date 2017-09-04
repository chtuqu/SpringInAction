package com.chtuqu.spring_in_action.ch2.java_config.config;

import com.chtuqu.spring_in_action.ch2.java_config.soundsystem.CompactDisc;
import com.chtuqu.spring_in_action.ch2.java_config.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlbumConfig {

    @Bean("lonelyHeartsClub")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

}
