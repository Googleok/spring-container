package com.cafe24.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer{

	// 와이어링 1
//	@Autowired
	private CompactDisc cd;

	public CDPlayer() {
		System.out.println("생성자");
	}
	
	// 와이어링 2 - 좀 더 Java 스럽다.
//	@Autowired
	public CDPlayer(CompactDisc cd) {
		System.out.println("다른 생성자");
		this.cd = cd;
	}

	// 와이어링 3 - setter
//	@Autowired
	public void setCompactDisc(CompactDisc cd) {
		System.out.println("setter");
		this.cd = cd;
	}
	
	// 와이어링 4 - 일반 method
	@Autowired
	public void insertCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
}
