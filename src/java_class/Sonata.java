package java_class;

public class Sonata {
	String model="rm12";
	String color="black";
	int price=5000;
	
	
	@Override
	public String toString() {
	   return this.model+" "+this.color+" "+this.price;
	}
}
