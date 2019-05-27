package com.cafe24.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/*
 * Auto Configuration - XML Config
 * Component Scanning (@Component, @Named, @Autowired, @Inject)
 *								   java표준 				java표준				
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/soundsystem/CDPlayerConfig.xml"})
public class CDPlayerXmlConfigTest {

	// System Out Rules
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer player;
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}

	@Test
	public void testPlayerNull() {
		assertNotNull(player);
	}

	@Test
	public void testPlay() {
		player.play();
		assertEquals("Playing shallow by 브래들리 쿠퍼, 레이디 가가", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
		// 화면 출력할 때 좋은 라이브러리가 있다.
		// 콘솔로 나가는 걸 다 잡아준다.
	}

}
