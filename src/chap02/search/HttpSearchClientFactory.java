package chap02.search;

public class HttpSearchClientFactory implements SearchClientFactory{

	private String server;
	private String contentType;
	private String encoding;
	public HttpSearchClientFactory(String server, String contentType, String encoding) {
		// TODO Auto-generated constructor stub
		this.server = server;
		this.contentType = contentType;
		this.encoding = encoding;
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.printf("HttpSearchClientFactory: �ʱ�ȭ ��- %s, %s, %s\n",server,contentType, encoding);
	}

	
	@Override
	public String toString() {
		return "HttpSearchClientFactory [server=" + server + ", contentType=" + contentType + ", encoding=" + encoding
				+ "]";
	}
	@Override
	public SearchClient create() {
		// TODO Auto-generated method stub
		return new HttpSearchClient();
	}
	
}
