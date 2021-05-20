package com.mukesh.design.pattern.adaptor;

public class AudioPlayer implements MediaPlayer{
    MediaPlayer adaptor;
    @Override
    public void play(String audioType, String fileName) {
        if("media".equalsIgnoreCase(audioType)){
            System.out.println("Playing audio");
        }else {
            adaptor = new Adaptor(audioType);
            adaptor.play(audioType, fileName);
        }

    }
}
