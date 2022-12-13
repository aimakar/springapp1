package org.example;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    public void doInit() {
        System.out.println("Doing my initialization");
    }

    public void doDestruction() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Sonata";
    }
}
