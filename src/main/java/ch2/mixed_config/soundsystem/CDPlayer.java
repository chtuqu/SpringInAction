package ch2.mixed_config.soundsystem;

import ch2.xml_config.soundsystem.CompactDisc;

public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
