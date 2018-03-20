package chap06_01;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap06.member.MemberService;
import chap06.member.UpdateInfo;

public class MainAopTypeTest {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap06_01/aopTypeTest2.xml");
				
		MemberService ms = ctx.getBean("memberService", MemberService.class);
		
		UpdateInfo updateInfo = new UpdateInfo();
		updateInfo.setNewName("ÃÖ¹ü±Õ");
		ms.update("madvicus", updateInfo);
		ctx.close();
	}
}
