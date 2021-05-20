package com.mukesh.design.pattern.adaptor;

public class Adaptor implements MediaPlayer{

    LatestMediaPlayer latestMediaPlayer;

    public Adaptor(String mediaType) {
        if("vlc".equalsIgnoreCase(mediaType)) {
            this.latestMediaPlayer = new VLC();
        }else if("mp4".equalsIgnoreCase(mediaType)) {
            this.latestMediaPlayer = new MP4();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(this.latestMediaPlayer != null) {
            this.latestMediaPlayer.play(fileName);
        }
    }
}
