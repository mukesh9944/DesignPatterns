package com.mukesh.design.pattern.adaptor;

public class MP4 implements LatestMediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP4 "+fileName);
    }
}
