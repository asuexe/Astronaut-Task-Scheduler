package com.Adaptor;

public class MediaAdapter implements MediaPlayer {

	   AdvancedMediaPlayer advancedMusicPlayer;

	   public MediaAdapter(String audioType){
	   
	      if(audioType.equalsIgnoreCase("vlc") ){
	         advancedMusicPlayer = new vlcPlayer();			
	         
	      }else if (audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer = new mp4PLayer();
	      }	
	   }

	   @Override
	   public void play(String Type, String FName) {
	   
	      if(Type.equalsIgnoreCase("vlc")){
	         advancedMusicPlayer.playvlc(Type,FName);
	      }
	      else if(Type.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer.playmp4(Type,FName);
	      }
	   }
	}