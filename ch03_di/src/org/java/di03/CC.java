package org.java.di03;

public class CC {
	private AA aa;
	private BB bb;
	
	public CC(AA aa) {
		this.aa = aa;
	}

	public void setAa(AA aa) {
		this.aa = aa;
	}
	
	public void setBb(BB bb) {
		this.bb = bb;
	}
	
	public void disp() {
		System.out.println(aa.toString());
		System.out.println(bb.toString());
	}
	
}
