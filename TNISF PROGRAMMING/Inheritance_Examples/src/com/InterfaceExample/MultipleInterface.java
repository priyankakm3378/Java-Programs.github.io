package com.InterfaceExample;

interface Playable {
	void play();
}

interface Recordable{
	void record();
}

class MusicPlayer implements Playable, Recordable{
	public void play() {
		System.out.println("Playing music");
	}
	
	public void record() {
		System.out.println("Music recorded");
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		MusicPlayer mp = new MusicPlayer();
		mp.play();
		mp.record(); 
		
	}

}
