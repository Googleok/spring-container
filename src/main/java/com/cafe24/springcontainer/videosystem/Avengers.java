package com.cafe24.springcontainer.videosystem;

// 자동이 아니기 때문에 Component를 붙여도 안됨
public class Avengers implements DigitalVideoDisc {

	private String title = "Avengers";
	private String studio = "MARVEL";
	
	@Override
	public void play() {
		System.out.println("Playing Movie " + studio +"'s " + title );
	}

}
