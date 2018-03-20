package chap06_02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap06.member.MemberService;
import chap06.member.MemberServiceImpl;
import chap06.member.UpdateInfo;

public class MainAopType {
	public static void main(String[] args) {
			useNoAop();
			System.out.println("===============");
			useAop();
	}
	private static void useNoAop() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(NoAopConfig.class);
		MemberService ms = ctx.getBean("memberService",MemberService.class);
		System.out.println(ms instanceof MemberService);
		System.out.println(ms instanceof MemberServiceImpl);
		ctx.close();
	}
	private static void useAop() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
		MemberService ms = ctx.getBean("memberService", MemberService.class);
		System.out.println(ms instanceof MemberService);
		System.out.println(ms instanceof MemberServiceImpl);
		System.out.println(ms.getClass().getName());
		UpdateInfo updateInfo = new UpdateInfo();
		updateInfo.setNewName("ÃÖ¹ü±Õ");
		ms.update("aaaa", updateInfo);
		ctx.close();
	}
}
