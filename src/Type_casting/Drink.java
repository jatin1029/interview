package Type_casting;

public class Drink {
String type;
int price;

}

class Coffee extends Drink{
	Coffee(){
		this.type="Espresso";
		this.price=250;
	}
	
	void coffeedetails() {
		System.out.println(this.type+" "+this.price);
	}
}


class Tea extends Drink{
	Tea(){
		this.type="Bubble-Tea";
		this.price=300;
	}
	void teadetails() {
		System.out.println(this.type+" "+this.price);
	}
}
