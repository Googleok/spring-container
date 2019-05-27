package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.videosystem.Avengers;
import com.cafe24.springcontainer.videosystem.DVDPlayer;
import com.cafe24.springcontainer.videosystem.DigitalVideoDisc;

//명시적 설정
@Configuration
public class DVDPlayerConfig {

	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	// 주입하기 1
//	@Bean
	public DVDPlayer dvdPlayer1() {
		return new DVDPlayer(avengers());
	}

	// 주입하기 2
//	@Bean
	public DVDPlayer dvdPlayer2(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}

	// 주입하기 3
//	@Bean(name="dvdPlayer3")
	public DVDPlayer dvdPlayer3(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer(dvd);
		player.setDigitalVideoDisc(dvd);
		return player;
	}
	
	// 주입하기 4
	@Bean(name="dvdPlayer4")
	public DVDPlayer dvdPlayer4() {
		return new DVDPlayer(avengers());
	}
	
	
}
