package ch2.java_config.config;

import ch2.java_config.soundsystem.CDPlayer;
import ch2.java_config.soundsystem.CompactDisc;
import ch2.java_config.soundsystem.MediaPlayer;
import ch2.java_config.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean("lonelyHeartsClub")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean("player1")
    public MediaPlayer cdPlayer1(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

    @Bean("player2")
    public MediaPlayer cdPlayer2(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
