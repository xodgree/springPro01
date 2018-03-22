package chap06_03;


import org.springframework.context.support.GenericXmlApplicationContext;

import chap06.board.NewArticleRequest;
import chap06.board.ReadArticleService;
import chap06.board.WriteArticleService;
import chap06.board.WriteArticleServiceImpl;
import chap06.member.MemberRegRequest;
import chap06.member.MemberService;
import chap06.member.UpdateInfo;

public class MainQuickStart1 {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:chap06_03/acQuickStart1.xml");

		WriteArticleService writeArticleService =
				ctx.getBean("writeArticleService", WriteArticleService.class);
		writeArticleService.write(new NewArticleRequest("writer", "title", "content"));
		
		   
		ctx.close();
	}
}
