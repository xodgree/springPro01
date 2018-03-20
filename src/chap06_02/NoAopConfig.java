package chap06_02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap06.member.MemberService;
import chap06.member.MemberServiceImpl;

@Configuration
public class NoAopConfig {

	@Bean
	public MemberService memberService() {
		return new MemberServiceImpl();
	}
}
