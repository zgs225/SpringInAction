package me.zgs225.springinaction.springidol;

public class Piano implements Instrument {
	public Piano() {
	}

	@Override
	public void play() {
		System.out.println("PLINK PLINK PLINK");
	}

}
