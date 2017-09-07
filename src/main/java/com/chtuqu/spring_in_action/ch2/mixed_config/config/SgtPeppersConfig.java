package com.chtuqu.spring_in_action.ch2.mixed_config.config;

import com.chtuqu.spring_in_action.ch2.xml_config.soundsystem.BlankDisc;
import com.chtuqu.spring_in_action.ch2.xml_config.soundsystem.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SgtPeppersConfig {

    @Bean("sgtPeppers")
    public CompactDisc sgtPeppers() {
        BlankDisc cd = new BlankDisc();
        cd.setArtist("The Beatles");
        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        cd.setTracks(Arrays.asList(
                "Sgt. Pepper's Lonely Hearts Club Band",
                "With a Little Help from My Friends",
                "Lucy in the Sky with Diamonds"
        ));
        return cd;
    }
}
