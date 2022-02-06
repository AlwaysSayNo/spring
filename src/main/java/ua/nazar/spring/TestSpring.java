package ua.nazar.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Author: " + player.getName());
        System.out.println("Volume: " + player.getVolume());
        player.playMusic();

        context.close();
    }

}
