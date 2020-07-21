
package Product;

public class Shirts extends Product implements Design {
	private String Patternscreen;
	private boolean Plain;
	private boolean hasButton;
	public Shirts() {
		
	}
	public Shirts(String Patternscreen,boolean Plain,boolean hasButton) {
		this.Patternscreen = Patternscreen;
		this.Plain = Plain;
		this.hasButton = hasButton;
	}
	public String getPatternscreen() {
		return Patternscreen;
	}
	public void setPatternscreen(String patternscreen) {
		Patternscreen = patternscreen;
	}
	public boolean isPlain() {
		return Plain;
	}
	public void setPlain(boolean plain) {
		Plain = plain;
	}
	public boolean isHasButton() {
		return hasButton;
	}
	public void setHasButton(boolean hasButton) {
		this.hasButton = hasButton;
	}

	public void Denim(boolean Denim) {
		System.out.println("Denim = "+Denim+"\n");
		
	}
	
	public void hasCollar(boolean hasCollar) {
		System.out.println("has Collar = "+hasCollar+"\n");
		
	}
	
	
}
