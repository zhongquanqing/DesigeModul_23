package caseWebService;


import caseImplement.MediaPlayerAdapter;

public class Main {
    public static void main(String[] args) {
        /*
        *        适配器：
        *        主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，
        *        而新环境要求的接口是现对象不能满足的。
        *        作用： 1、可以让任何两个没有关联的类一起运行。
         *              2、提高了类的复用。
         *              3、增加了类的透明度。
         *              4、灵活性好。
        *               5.适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
        * */

        MediaPlayerAdapter mediaPlayer=new MediaPlayerAdapter();
        mediaPlayer.getMpPlayer("mp3");
        mediaPlayer.getMpPlayer("mp4");
        mediaPlayer.getVlcPlayer();
    }
}
