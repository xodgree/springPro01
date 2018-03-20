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
		System.out.println("MyBean.setProperty1() 角青");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean.destroy() 角青");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean.afterPropertiesSet() 角青");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("ApplicationContextAware....context()角青");
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("BeanNameAware.setBeanName()角青");
	}
	
	public void customInit() {
		System.out.println("MyBean.customInit() 角青");
	}
	@PostConstruct
	public void postConstruct() {
		System.out.println("@PostConstruct() 角青");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy() 角青");
	}
	public void customDestroy() {
		System.out.println("MyBean.customDestroy() 角青");
	}
	
}
