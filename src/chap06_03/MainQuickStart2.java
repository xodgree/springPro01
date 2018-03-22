package chap06_03;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap06.board.ReadArticleService;

public class MainQuickStart2 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap06_03/acQuickStart2.xml");
		
		ReadArticleService readArticleService = ctx.getBean(ReadArticleService.class);
		readArticleService.read(1);
		readArticleService.read(1);
		ctx.close();
	}
}
