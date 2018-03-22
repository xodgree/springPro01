package chap06_05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import chap06.board.ArticleDao;
import chap06.board.MemoryArticleDao;
import chap06.board.ReadArticleServiceImpl;
import chap06.board.WriteArticleServiceImpl;
import chap06.member.MemberServiceImpl;
import chap06_01.UpdateMemberInfoTraceAspect;
import chap06_04.ArticleCacheAspect;
import chap06_04.ProfilingAspect;

@Configuration
@EnableAspectJAutoProxy
public class QuickStartConfig {
	@Bean
	public ProfilingAspect performanceTraceAspect() {
		return new ProfilingAspect();
	}
	@Bean
	public UpdateMemberInfoTraceAspect memberInfoTraceAspect() {
		return new UpdateMemberInfoTraceAspect();
	}
	@Bean
	public ArticleCacheAspect cache() {
		return new ArticleCacheAspect();
	}
	@Bean
	public ArticleDao articleDao() {
		return new MemoryArticleDao();
	}
	@Bean
	public WriteArticleServiceImpl writeArticleService() {
		return new WriteArticleServiceImpl(articleDao());
	}
	@Bean 
	public MemberServiceImpl memberService() {
		return new MemberServiceImpl();
	}
	@Bean
	public ReadArticleServiceImpl readArticleService() {
		ReadArticleServiceImpl svc = new ReadArticleServiceImpl();
		svc.setArticleDao(articleDao());
		return svc;
	}
}
