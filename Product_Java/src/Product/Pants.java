package Product;

public class Pants extends Product {
	private boolean withZipper;
	private boolean Jeans;
	
	public Pants() {
		
	}
	public Pants(boolean withZipper,boolean Jeans) {
		this.withZipper = withZipper;
		this.Jeans = Jeans;
	}
	public boolean isWithZipper() {
		return withZipper;
	}
	public void setWithZipper(boolean withZipper) {
		this.withZipper = withZipper;
	}
	public boolean isJeans() {
		return Jeans;
	}
	public void setJeans(boolean jeans) {
		Jeans = jeans;
	}
	
}
	