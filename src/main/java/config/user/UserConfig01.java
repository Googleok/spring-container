package config.user;

import org.springframework.context.annotation.Bean;

import com.cafe24.springcontainer.user.User;

public class UserConfig01 {
	
	// 명시적 주입
	@Bean
	public User user() {
		return new User();
	}
}
