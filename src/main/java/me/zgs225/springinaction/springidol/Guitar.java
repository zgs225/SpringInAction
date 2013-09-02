package me.zgs225.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Strum strum strum");
	}

}
