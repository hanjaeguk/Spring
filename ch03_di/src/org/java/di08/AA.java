package org.java.di08;

public class AA {
	private int aa;
	private int bb;
	
	public AA() {}
	
	public AA(int aa, int bb) {
		this.aa = aa;
		this.bb = bb;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	@Override
	public String toString() {
		return "AA [aa=" + aa + ", bb=" + bb + "]";
	}
	
	
}
