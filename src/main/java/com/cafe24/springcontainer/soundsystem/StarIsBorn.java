package com.cafe24.springcontainer.soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;

// 왜 component를 붙일까? Scanning 해서 찾게 하기 위해서
@Component("starIsBorn")
//@Named("starIsBorn")
public class StarIsBorn implements CompactDisc{
	private String title = "shallow";
	private String artist = "브래들리 쿠퍼, 레이디 가가"; 
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
	
}
