package cn.net.lisong.spring00.hello;

import javax.inject.Inject;
import javax.inject.Named;

@Named("hello")
public class Hello {
	@Inject
	private Greeter greeter;

	public void say() {
		System.out.println(greeter.sayHello());
	}
}
