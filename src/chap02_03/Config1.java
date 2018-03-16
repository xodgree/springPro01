package chap02_03;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap02.AuthFailLogger;
import chap02.AuthenticationService;
import chap02.PasswordChangeService;
import chap02.User;
import chap02.UserRepository;

@Configuration
public class Config1 {
	
	@Autowired
	public UserRepository userRepository;
	
	@Bean
	public PasswordChangeService pwChangeSve() {
		return new PasswordChangeService(userRepository);
	}
	@Bean
	public AuthFailLogger authFailLogger() {
		AuthFailLogger logger = new AuthFailLogger();
		logger.setThreshold(2);
		return logger;
	}
	@Bean
	public AuthenticationService authenticationService() {
		AuthenticationService authSvc = new AuthenticationService();
		authSvc.setFailLogger(authFailLogger());
		authSvc.setUserRepository(userRepository);
		return authSvc;
	}
}

