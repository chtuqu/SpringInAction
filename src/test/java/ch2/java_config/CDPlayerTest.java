package ch2.java_config;

import ch2.java_config.config.CDPlayerConfig;
import ch2.java_config.soundsystem.CompactDisc;
import ch2.java_config.soundsystem.MediaPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    @Qualifier("player1")
    private MediaPlayer player;

    @Inject
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

    @Test
    public void play() {
        Assert.assertNotNull(player);
        player.play();
    }
}
