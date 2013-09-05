package me.zgs225.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {

	@DeclareParents(
			value = "me.zgs225.springinaction.springidol.Performer+",
			defaultImpl = GraciousContestant.class)
	public static Contestant contestant;
}
