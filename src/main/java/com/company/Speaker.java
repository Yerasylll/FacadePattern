package com.company;

public class Speaker {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier setVolume: " + volume);
    }
}
