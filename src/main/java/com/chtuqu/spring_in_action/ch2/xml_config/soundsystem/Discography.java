package com.chtuqu.spring_in_action.ch2.xml_config.soundsystem;

import java.util.List;

public class Discography {

    private String artist;
    private List<CompactDisc> cds;

    public Discography(String artist, List<CompactDisc> cds) {
        this.artist = artist;
        this.cds = cds;
    }

    public void playAll() {
        cds.forEach(CompactDisc::play);
    }
}
