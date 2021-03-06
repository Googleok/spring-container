package com.cafe24.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/*
 * Explicit Configuration - Java Config
 * @Bean 
 */

import config.videosystem.DVDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DVDPlayerConfig.class)
public class DVDPlayerJavaConfigTest {

	// System Out Rules
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Autowired
	private DigitalVideoDisc dvd;

	@Autowired
	@Qualifier("dvdPlayer4")	//Bean이 여러개 열려 있을 때 어떤 것을 쓸지 결정 해주는 것
	private DVDPlayer player;
	
	@Test
	public void testDVDNull() {
		assertNotNull(dvd);
	}

	@Test
	public void testPlayerNull() {
		assertNotNull(player);
	}
	
	@Test
	public void testPlay() {
		player.play();
		assertEquals("Playing Movie MARVEL's Avengers", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
