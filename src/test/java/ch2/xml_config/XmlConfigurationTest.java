package ch2.xml_config;

import ch2.xml_config.soundsystem.Discography;
import ch2.xml_config.soundsystem.MediaPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/xml_config/ch2-configuration.xml")
public class XmlConfigurationTest {

    @Autowired
    @Qualifier("cdPlayer2")
    private MediaPlayer player;

    @Autowired
    private Discography discography;

    @Test
    public void play() {
        Assert.assertNotNull(discography);
        Assert.assertNotNull(player);
        discography.playAll();
    }
}
