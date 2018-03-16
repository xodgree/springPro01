package chap02_04_01;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap02.search.SearchClientFactory;

public class MainForSearch {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap02_04_01/config-search.xml");
		SearchClientFactory factory = ctx.getBean("searchClientFactory", SearchClientFactory.class);
		System.out.println(factory);
		SearchClientFactory factory2 = ctx.getBean("searchClientFactory", SearchClientFactory.class);
		System.out.println("same instance = " + (factory == factory2));
		ctx.close();
	}
}
