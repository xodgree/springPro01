package chap06_06;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap06.board.NewArticleRequest;
import chap06.board.ReadArticleService;
import chap06.board.WriteArticleService;


public class MainDesignatorTest {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap06_06/designatorTest.xml");
		WriteArticleService writeSvc = ctx.getBean("writeArticleService", WriteArticleService.class);
		writeSvc.write(new NewArticleRequest("writer","title" , "content"));
		ReadArticleService readSvc = ctx.getBean("readArticleService",ReadArticleService.class);
		System.out.println("-------ù ��° readSvc.read(1)");
		System.out.println("-------�� ��° readSvc.read(1)");
		readSvc.read(1);
		ctx.close();
	}
}
