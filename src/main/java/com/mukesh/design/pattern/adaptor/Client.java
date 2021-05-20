package com.mukesh.design.pattern.adaptor;

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc","song.vlc");
        audioPlayer.play("media","song.dat");
    }
}
