package com.chtuqu.spring_in_action.ch2.mixed_config.config;

import com.chtuqu.spring_in_action.ch2.xml_config.soundsystem.BlankDisc;
import com.chtuqu.spring_in_action.ch2.xml_config.soundsystem.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class YellowSubmarineConfig {

    @Bean("yellowSubmarine")
    public CompactDisc getYellowSubmarine() {
        BlankDisc cd = new BlankDisc();
        cd.setArtist("The Beatles");
        cd.setTitle("Yellow Submarine");
        cd.setTracks(Arrays.asList(
                "Yellow Submarine",
                "Only a Northern Song",
                "All Together Now"
        ));
        return cd;
    }
}
