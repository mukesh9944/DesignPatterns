package com.mukesh.design.pattern.adaptor;

public class VLC implements LatestMediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Paying VLC "+fileName);
    }
}
