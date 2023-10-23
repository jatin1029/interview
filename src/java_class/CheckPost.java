package java_class;

public class CheckPost {

	// Coffee class
	Coffee getcoffee() {
		Coffee c1=new Coffee();
		return c1;
	}
	
	Tea gettea() {
      Tea t1=new Tea();
      return t1;
	}
	
	public static void main(String[] args) {
		CheckPost c1=new CheckPost(); 
		Coffee c=c1.getcoffee();
		Tea t=c1.gettea();
		
		System.out.println(c);
		System.out.println(t);
	}

}
