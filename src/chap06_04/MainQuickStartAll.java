package chap06_04;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap06.board.NewArticleRequest;
import chap06.board.ReadArticleService;
import chap06.board.WriteArticleService;
import chap06.member.MemberRegRequest;
import chap06.member.MemberService;
import chap06.member.UpdateInfo;

public class MainQuickStartAll {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap06_04/acQuickStartAll.xml");
		
		WriteArticleService writeArticleService =
				ctx.getBean("writeArticleService", WriteArticleService.class);
		writeArticleService.write(new NewArticleRequest("writer", "title", "content"));
		System.out.println("===========================");
		ReadArticleService readArticleService = ctx.getBean(ReadArticleService.class);
		readArticleService.read(1);
		readArticleService.read(1);
		System.out.println("===========================");
		MemberService memberService = ctx.getBean(MemberService.class);
		MemberRegRequest memberRegReq = new MemberRegRequest("id", "name", "pw");
		memberService.regist(memberRegReq);
		UpdateInfo updateInfo = new UpdateInfo();
		updateInfo.setNewName("ªı¿Ã∏ß");
		memberService.update("madvirus", updateInfo);
		ctx.close();
	}
}
