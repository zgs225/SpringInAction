package me.zgs225.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader {
	private String thoughts;
	
	@Pointcut("execution"
			+ " (* me.zgs225.springinaction.springidol.Thinker.thinkOfSomething(String))"
			+ " && args(thoughts)")
	public void thinking(String thoughts) {}

	@Override
	@Before("thinking(thoughts)")
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts : " + thoughts);
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts() {
		return thoughts;
	}

}
