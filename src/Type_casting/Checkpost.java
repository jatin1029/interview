package Type_casting;

public class Checkpost {

	Drink getdatails(int input) { // here we can't use Object because Coffee and Tea inherit proper to Drink;
		if(input==1) {
			return new Coffee();
		}
		else {
			return new Tea();
		}
	}
	
    public static void main(String[] args) {
		Checkpost c1=new Checkpost();
		
		Drink x=c1.getdatails(2);
		
		if(x instanceof Coffee) {
           Coffee c=(Coffee)x;
		c.coffeedetails();
	}
		else {
			Tea t=(Tea)x;
			t.teadetails();
		}
		
}
}
