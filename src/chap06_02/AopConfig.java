package chap06_02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import chap06.member.MemberService;
import chap06.member.MemberServiceImpl;
import chap06_01.UpdateMemberInfoTraceAspect;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

	@Bean
	public UpdateMemberInfoTraceAspect memberInfoTraceAspect() {
		return new UpdateMemberInfoTraceAspect();
	}
	
	@Bean
	public MemberService memberService() {
		return new MemberServiceImpl();
	}
}
