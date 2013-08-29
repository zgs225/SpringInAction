package me.zgs225.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-idol.xml");
		Performer performer = (Performer) ctx.getBean("poeticJuggler");
		performer.perform();
	}
}
