package ru.egorov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", Music.class); 

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        classicalMusicPlayer.playMusic();

        context.close();
    }
	
	private static void lab1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		TestBean testBean = context.getBean("testBean", TestBean.class);
		
		System.out.println(testBean.getName());
		
		context.close();
	}
	
	private void lab2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();
	}
	
	private void lesson7() {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//
//		 MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//	     MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//	     boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//	     System.out.println(comparison);
//
//	     System.out.println(firstMusicPlayer);
//	     System.out.println(secondMusicPlayer);
//	     
//	     firstMusicPlayer.setVolume(10);
//	     
//	     System.out.println(firstMusicPlayer.getVolume());
//	     System.out.println(secondMusicPlayer.getVolume());
//        
//        context.close();
	}
	
	private void lesson8() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());
        
		context.close();
	}
}
