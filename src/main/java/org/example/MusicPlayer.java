package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicStyle musicStyle) {
        String song = "";
        int numberOfSong = new Random().nextInt(3);
        switch (musicStyle) {
            case ROCK:
                song = music1.getList().get(numberOfSong);
                break;
            case CLASSICAL:
                song = music2.getList().get(numberOfSong);;
                break;
        }
        return "Playing: " + song;
    }
}
