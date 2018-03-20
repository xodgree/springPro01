package chap03.c01;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBean implements BeanNameAware, ApplicationContextAware, InitializingBean,DisposableBean{
	public void setProperty1(String property1) {
		System.out.println("MyBean.setProperty1() ����");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean.destroy() ����");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean.afterPropertiesSet() ����");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("ApplicationContextAware....context()����");
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("BeanNameAware.setBeanName()����");
	}
	
	public void customInit() {
		System.out.println("MyBean.customInit() ����");
	}
	@PostConstruct
	public void postConstruct() {
		System.out.println("@PostConstruct() ����");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy() ����");
	}
	public void customDestroy() {
		System.out.println("MyBean.customDestroy() ����");
	}
	
}
