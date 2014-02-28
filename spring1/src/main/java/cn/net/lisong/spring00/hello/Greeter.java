package cn.net.lisong.spring00.hello;

import javax.inject.Named;

@Named("greeter")
public class Greeter {
	public String sayHello() {
		return "Hello world!";
	}
}
