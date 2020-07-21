package Product;

public class Jackets extends Product implements Design {
	private boolean hasHat;
	private boolean isLeather;
	
	public Jackets() {
		
	}
	public Jackets(boolean hasHat,boolean isLeather) {
		this.hasHat = hasHat;
		this.isLeather = isLeather;
	}
	public boolean isHasHat() {
		return hasHat;
	}
	public void setHasHat(boolean hasHat) {
		this.hasHat = hasHat;
	}
	public boolean isLeather() {
		return isLeather;
	}
	public void setLeather(boolean isLeather) {
		this.isLeather = isLeather;
	}
	
	public void Denim(boolean Denim) {
		System.out.println("Denim = "+Denim+"\n");
		
	}
	
	public void hasCollar(boolean hasCollar) {
		System.out.println("has Collar = "+hasCollar+"\n");
		
	}
}
