package org.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("org/springinaction/springidol/bean.xml");
        Instrument performer = (Instrument) ctx.getBean("guitar");
        performer.play();
       
    }
    
}
