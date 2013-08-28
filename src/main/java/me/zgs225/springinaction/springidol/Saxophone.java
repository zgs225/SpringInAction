package me.zgs225.springinaction.springidol;

public class Saxophone implements Instrument {
	public Saxophone() {
	}

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}

}
