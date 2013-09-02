package me.zgs225.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {

	public Instrumentalist() {}
	
	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing " + song + " ; ");
		instrument.play();
	}

	private String song;

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
	
	public String screamSong() {
		return song;
	}
	
	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	
}
