package com.chtuqu.spring_in_action.ch2.java_config.config;

import com.chtuqu.spring_in_action.ch2.java_config.soundsystem.CDPlayer;
import com.chtuqu.spring_in_action.ch2.java_config.soundsystem.CompactDisc;
import com.chtuqu.spring_in_action.ch2.java_config.soundsystem.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfig {

    @Bean("player1")
    public MediaPlayer cdPlayer1(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

    @Bean("player2")
    public MediaPlayer cdPlayer2(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
