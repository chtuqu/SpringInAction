package ch2.java_config.config;

import ch2.java_config.soundsystem.CompactDisc;
import ch2.java_config.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlbumConfig {

    @Bean("lonelyHeartsClub")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

}
