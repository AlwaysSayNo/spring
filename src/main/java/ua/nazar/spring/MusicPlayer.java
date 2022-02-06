package ua.nazar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1, music2;
    
    enum MusicGenre{ROCK, CLASSICAL}

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, 
                       @Qualifier("classicalMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicGenre genre){
        String music = null;
        if(genre == MusicGenre.ROCK) music = this.music1.getSong();
        else if(genre == MusicGenre.CLASSICAL) music = this.music2.getSong();

        System.out.println("Playing: " + music);
    }
}
