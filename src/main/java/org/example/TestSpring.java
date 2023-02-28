package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);
        Music music1 = context.getBean("musicBean1", Music.class);
        Music music2 = context.getBean("musicBean2", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer.playMusic();
        musicPlayer1.playMusic();
        musicPlayer2.playMusic();
        context.close();
    }
}
