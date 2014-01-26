package cn.net.lisong.spring0.app;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.net.lisong.spring0.dao.SetterDemoDAO;
import cn.net.lisong.spring0.service.SetterDemoService;

public class TestClassPath {

	private static final Log log = LogFactory.getLog(TestClassPath.class);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml", "service.xml");
		
		SetterDemoDAO SetterDemoDAO = (SetterDemoDAO) context.getBean("setterDemoDAO");
		log.info(SetterDemoDAO);
		
		SetterDemoService setterDemoService = (SetterDemoService) context.getBean("setterDemoService");
		log.info(setterDemoService);
	}
}
