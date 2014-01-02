package cn.net.lisong.spring0.domain;

public class DemoB {

	private DemoA demoA;

	public DemoB(DemoA demoA) {
		super();
		this.demoA = demoA;
	}

	@Override
	public String toString() {
		return "DemoB [demoA=" + demoA + "]";
	}
	
}
