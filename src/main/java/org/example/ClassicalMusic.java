package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {


//    private ClassicalMusic() {}
//
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
//    public void doInit() {
//        System.out.println("Doing my initialization");
//    }
//
//    public void doDestruction() {
//        System.out.println("Doing my destruction");
//    }
    @Override
    public String getSong() {
        return "Sonata";
    }

    @Override
    public List<String> getList() {
        return new ArrayList(Arrays.asList("Concert 2 Violas","Moon Sonata","3 Symphony"));
    }
}
