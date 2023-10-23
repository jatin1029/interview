package java_class;

public class Lipstick {
	String brand, shade;
	int price;

	public Lipstick(String brand, String shade, int price) {
		this.brand = brand;
		this.shade = shade;
		this.price = price;
	}

	void details() {
		System.out.println(this.brand + " " + this.shade + " " + this.price);
	}

	public static void main(String[] args) {
		Lipstick l1 = new Lipstick("lakme", "crimso", 250); 
		Lipstick l2 = new Lipstick("sugar", "cherry", 150);
		Lipstick l3 = new Lipstick("nyka", "crimso", 200);

		Lipstick x[] = { l1, l2, l3 };

		for (int i = 0; i < x.length; i++) {
			x[i].details();
		}
//	for(Lipstick l:x)      
//	{
//		l.details();
//	}

	}
}
