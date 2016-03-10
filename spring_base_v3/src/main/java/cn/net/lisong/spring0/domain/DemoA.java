package cn.net.lisong.spring0.domain;

public class DemoA {

	private DemoB demoB;

	public DemoA(DemoB demoB) {
		this.demoB = demoB;
	}

	@Override
	public String toString() {
		return "DemoA [demoB=" + demoB + "]";
	}
	
}
