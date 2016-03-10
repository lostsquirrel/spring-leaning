package cn.net.lisong.spring0.domain;

public class ConsType {

	private int typeInt1;
	
	private int typeInt2;
	
	private String typeString1;
	
	private String typeString2;
	
	private double typeDouble1;

	public ConsType(int typeInt1, int typeInt2, String typeString1,
			String typeString2, double typeDouble1) {
		super();
		this.typeInt1 = typeInt1;
		this.typeInt2 = typeInt2;
		this.typeString1 = typeString1;
		this.typeString2 = typeString2;
		this.typeDouble1 = typeDouble1;
	}

	@Override
	public String toString() {
		return "ConsType [typeInt1=" + typeInt1 + ", typeInt2=" + typeInt2
				+ ", typeString1=" + typeString1 + ", typeString2="
				+ typeString2 + ", typeDouble1=" + typeDouble1 + "]";
	}
	
}
