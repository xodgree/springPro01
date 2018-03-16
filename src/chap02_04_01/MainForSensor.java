package chap02_04_01;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap02.sensor.Monitor;

public class MainForSensor {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap02_04_01/config-sensor.xml");
				Monitor monitor = ctx.getBean(Monitor.class);
		System.out.println(monitor);
		ctx.close();
	}
}
