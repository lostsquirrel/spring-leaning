package cn.net.lisong.spring0.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClassPath {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		//System.out.println(context.getBean("setterDemoService"));
		//SetterDemoServiceImpl [setterDemoDAO=cn.net.lisong.spring0.dao.impl.SetterDemoDAOImpl@eb0945]
		
		/*
		System.out.println(context.getBean("demoA"));
		System.out.println(context.getBean("da"));
		System.out.println(context.getBean("consType"));
		System.out.println(context.getBean("consTypeIndex"));
		*/
		
		
		//System.out.println(context.getBean("consTypeName"));
		//org.springframework.beans.factory.BeanCurrentlyInCreationException

	}
}
