package org.example;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

import static org.example.MusicStyle.CLASSICAL;
import static org.example.MusicStyle.ROCK;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> styleList;


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public MusicPlayer(List<Music> styleLIst) {
        this.styleList = styleLIst;

    }

    public String playMusic() {
        Music musicStyle = styleList.get(new Random().nextInt(styleList.size()));
        int numberOfSong = new Random().nextInt(musicStyle.getList().size());
        return "Playing: " + musicStyle.getList().get(numberOfSong);
    }
}
