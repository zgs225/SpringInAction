package me.zgs225.springinaction.springidol;

public class Stage {
	private Stage() {
	}
	
	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
}
