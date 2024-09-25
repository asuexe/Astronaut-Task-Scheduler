package com.Adaptor;

public class vlcPlayer implements AdvancedMediaPlayer {
	public void playvlc(String type,String FName) {
		System.out.println("playing vlc file "+ FName);
	}
	public void playmp4(String type,String FName) {
		//do nothing
	}

}
