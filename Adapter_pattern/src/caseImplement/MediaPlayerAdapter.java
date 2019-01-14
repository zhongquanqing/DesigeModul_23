package caseImplement;

import interfaceCase.MediaPlayer;

public class MediaPlayerAdapter implements MediaPlayer {
    MpPlayer s = new MpPlayer();
    VlcPlayer vlcPlayer = new VlcPlayer();
    //调用相关的方法，减少代码的复用

    @Override
    public void getMpPlayer(String type) {
        if (type.equalsIgnoreCase("mp3")) {
            s.ShowMP3();
        } else if (type.equalsIgnoreCase("mp4")) {
            s.ShowMP4();
        } else {
            System.out.println("播放格式有误");
        }
    }

    @Override
    public void getVlcPlayer() {
        vlcPlayer.ShowVlc();
    }
}
