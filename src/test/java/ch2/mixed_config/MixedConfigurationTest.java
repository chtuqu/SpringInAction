package ch2.mixed_config;

import ch2.mixed_config.soundsystem.MediaPlayer;
import ch2.mixed_config.config.SoundSystemConfig;
import ch2.xml_config.soundsystem.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class MixedConfigurationTest {

    @Autowired
    @Qualifier("abbeyRoad")
    private CompactDisc abbeyRoad;

    @Autowired
    @Qualifier("cdPlayer")
    private MediaPlayer cdPlayer;

    @Test
    public void play() {
        Assert.assertNotNull(abbeyRoad);
        Assert.assertNotNull(cdPlayer);
        cdPlayer.play();
    }
}
