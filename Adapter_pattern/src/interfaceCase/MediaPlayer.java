package interfaceCase;

import caseImplement.MpPlayer;
import caseImplement.VlcPlayer;

public interface MediaPlayer {
    //提供调用Mp和Vlc两个类的方法
    public void getMpPlayer( String type);
    public void getVlcPlayer();

}
