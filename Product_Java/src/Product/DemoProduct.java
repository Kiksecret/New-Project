package Product;

public class DemoProduct {

	public static void main(String[] args) {
		Shirts s1 = new Shirts();
		s1.Productname = "Traveller Shirt" ;
		s1.Type = "Polo" ;
		s1.setSize("M");
		s1.setColor("Black");
		s1.setPatternscreen("Mickey");
		s1.setPlain(false);
		s1.setHasButton(true);
		s1.setPrice(590);
		
		Jackets j1 = new Jackets();
		j1.Productname = "Basic Zipped";
		j1.Type = "Bomber";
		j1.setSize("L");
		j1.setColor("Grey");
		j1.setHasHat(false);
		j1.setLeather(true);
		j1.setPrice(1590);
		
		Pants p1 = new Pants();
		p1.Productname = "Jogger Style";
		p1.Type = "Jogger";
		p1.setSize("S");
		p1.setColor("Blue");
		p1.setWithZipper(true);
		p1.setJeans(false);;
		p1.setPrice(1190);
		
		System.out.println("--------------Shirts------------"+"\n");
		System.out.println("Product Name : "+s1.Productname);	
		System.out.println("Type : "+s1.Type);
		System.out.println("Size : "+s1.getSize());
		System.out.println("Color : "+s1.getColor());
		System.out.println("Patternscreen : "+s1.getPatternscreen());
		System.out.println("Plain : "+s1.isPlain());
		System.out.println("Button : "+s1.isHasButton());
		System.out.println("has Collar : "+Design.hasCollar);
		System.out.println("Price : "+s1.getPrice());
		
		System.out.println("--------------Jackets--------------"+"\n");
		System.out.println("Product Name : "+j1.Productname);	
		System.out.println("Type : "+j1.Type);
		System.out.println("Size : "+j1.getSize());
		System.out.println("Color : "+j1.getColor());
		System.out.println("has Hat : "+j1.isHasHat());
		System.out.println("is Laether : "+j1.isLeather());
		System.out.println("has Collar : "+Design.hasCollar);
		System.out.println("is Denim : "+Design.Denim);
		System.out.println("Price : "+j1.getPrice());  
		
		System.out.println("---------------Plants--------------"+"\n");
		System.out.println("Product Name : "+p1.Productname);	
		System.out.println("Type : "+p1.Type);
		System.out.println("Size : "+p1.getSize());
		System.out.println("Color : "+p1.getColor());
		System.out.println("has Zipper : "+p1.isWithZipper());
		System.out.println("is Jeans : "+p1.isJeans());
		System.out.println("Price : "+p1.getPrice()); 
		System.out.println("___________________________________"+"\n");
	}
}
