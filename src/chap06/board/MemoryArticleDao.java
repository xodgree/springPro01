package chap06.board;

import java.util.HashMap;
import java.util.Map;

public class MemoryArticleDao implements ArticleDao{
	private int articleNo = 0;
	private Map<Integer, Article> articleMap = new HashMap<>();
	
	@Override
	public void insert(Article article) {
		// TODO Auto-generated method stub
		System.out.println("MemoryArticleDao.insert() ȣ���");
		articleNo++;
		article.setId(articleNo);
		articleMap.put(articleNo, article);
		
	}
	@Override
	public Article selectById(Integer id) {
		return articleMap.get(id);
	}
	
}
