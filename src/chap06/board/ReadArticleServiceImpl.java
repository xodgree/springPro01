package chap06.board;

public class ReadArticleServiceImpl implements ReadArticleService{
	private ArticleDao articleDao;
	
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	@Override
	public Article read(Integer id) {
		// TODO Auto-generated method stub
		System.out.printf("ReadArticleServiceImpl.read(%d) »£√‚µ \n", id);
		return articleDao.selectById(id);
	}
	
}
