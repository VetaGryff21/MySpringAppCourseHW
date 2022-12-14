package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        Music music = context.getBean("rockMusic", RockMusic.class);
        Music music1 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(music1 == music);

        context.close();
    }
}
