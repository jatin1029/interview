package Type_casting;

public class Watch {
String model,colour;
int price;
}

class Sonata extends Watch{
	Sonata(){
		this.model="so=257";
		this.colour="gold";
		this.price=2599;	
	}
	void getsonata() {
		System.out.println(this.model+" "+this.colour+" "+this.price);
	}
}

class Titan extends Watch{
	Titan(){
		this.model="Ti=225";
		this.colour="Black";
		this.price=5999;
	}
	void gettitan() {
		System.out.println(this.model+" "+this.colour+" "+this.price);
	}
}

class Fasttrack extends Watch{
	Fasttrack(){
		this.model="fs=250";
		this.colour="grey";
		this.price=6999;
	}
	
	void getFasttrack() {
		System.out.println(this.model+" "+this.colour+" "+this.price);
	}
	
}