package chap06_03;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

import chap06.board.Article;

public class ArticleCacheAdvice {
	private Map<Integer, Article> cache = new HashMap<Integer,Article>();
	
	public Article cache(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("[ACA] ����");
		try {
			Integer id = (Integer) joinPoint.getArgs()[0];
			Article article = cache.get(id);
			if(article != null) {
				System.out.println("[ACA] ĳ�ÿ��� Articlep[" + id + "] ����");
				return article;
			
			}
		Article ret = (Article) joinPoint.proceed();
		if(ret != null) {
			cache.put(id, ret);
			System.out.println("[ACA] ĳ�ÿ� Article[" + id + "]�߰���");
		}
		return ret;
		}finally {
			System.out.println("[ACA] ��");
		}
	}
}
