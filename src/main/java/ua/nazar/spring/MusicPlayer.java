package ua.nazar.spring;

import java.util.List;

public class MusicPlayer {
    private List<Music> songs;
    private String name;
    private int volume;


    public MusicPlayer(List<Music> songs){
        this.songs = songs;
    }

    public MusicPlayer(){
    }


/*    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }*/

    public List<Music> getSongs() {
        return songs;
    }

    public void setSongs(List<Music> songs) {
        this.songs = songs;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        System.out.println("Playlist consists from " + songs.size() + " songs.");
        System.out.println("[");
        for(Music m : songs){
            System.out.println(m.getSong());
        }
        System.out.println("]");
    }
}
