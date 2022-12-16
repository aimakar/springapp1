package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean AlternativeMusic alternativeMusic() {
        return new AlternativeMusic();
    }

    @Bean
    List<Music> styleList() {
        return Arrays.asList(classicalMusic(), rockMusic(), alternativeMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(styleList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
