package cn.net.lisong.spring00.hello;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	
	private static final Log log = LogFactory.getLog(HelloWorld.class);
	
	public static void main(String[] args) {
		ApplicationContext crt = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
		log.info(Arrays.toString(crt.getBeanDefinitionNames()));
		Hello greeter = crt.getBean("hello", Hello.class);
		greeter.say();
	}
}
