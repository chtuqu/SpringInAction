package ch2.automatic_config.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;

@Named
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
