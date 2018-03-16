package chap02_03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap02.AuthenticationService;
import chap02.PasswordChangeService;

public class MainByJavaConfig {
	public static void main(String[] args) {
		useSingClass();
		useMultipleClass();
	}
	private static void useSingClass() {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Config.class);
		useBean(ctx); ctx.close();
	}
	
	private static void useMultipleClass() {
		AnnotationConfigApplicationContext ctx
		= new AnnotationConfigApplicationContext(Config1.class,Config2.class);
		useBean(ctx);
		ctx.close();
	}
	
	private static void useBean(AnnotationConfigApplicationContext ctx) {
		AuthenticationService authSvc = ctx.getBean("authenticationService",AuthenticationService.class);
		authSvc.authenticate("bkchoi", "1234");
		PasswordChangeService pwChgSvc = ctx.getBean(PasswordChangeService.class);
	pwChgSvc.changePassword("bkchoi", "1234", "5678");
		
		
	}
}
