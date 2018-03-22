package chap06_03;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap06.board.NewArticleRequest;
import chap06.board.ReadArticleService;
import chap06.board.WriteArticleService;

public class MainAll {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap06_03/acAll.xml");
		
		WriteArticleService writeArticleService =
				ctx.getBean("writeArticleService", WriteArticleService.class);
		writeArticleService.write(new NewArticleRequest("writer", "title", "content"));
		
		ReadArticleService readArticleService = ctx.getBean(ReadArticleService.class);
		readArticleService.read(1);
		readArticleService.read(1);
		ctx.close();
	}
}
