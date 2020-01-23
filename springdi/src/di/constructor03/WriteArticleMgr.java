package di.constructor03;

public class WriteArticleMgr implements IWriteArticleMgr{
	private IArticleDAO articleDAO;

	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}
	
	public void write(ArticleDTO article) {
		System.out.println("article write~~~");
		articleDAO.insert(article);
	}
	
}
