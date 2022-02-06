package ua.nazar.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(MusicPlayer.MusicGenre.CLASSICAL);
        player.playMusic(MusicPlayer.MusicGenre.ROCK);

        context.close();
    }

}
