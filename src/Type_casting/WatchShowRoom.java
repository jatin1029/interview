package Type_casting;

public class WatchShowRoom {

	Watch getwatch(String input) {
		if(input.equalsIgnoreCase("Titan")) {
			return new Titan();
		}
		
		else if(input.equalsIgnoreCase("Sonata")) {
			   return new Sonata();
		}
		else if(input.equalsIgnoreCase("Fasttrack"))  {
			return new Fasttrack();
		}
		else {
			System.out.println("Watch not found");
			return null;
		}
	}
	
	public static void main(String[] args) {
		WatchShowRoom w1=new WatchShowRoom ();
		Watch w=w1.getwatch("Rollex");
		
		if(w!=null) {
		if(w instanceof Titan) {
			Titan t=(Titan)w;
			t.gettitan();
		}
		else if(w instanceof Sonata) {
			Sonata s=(Sonata)w;
			s.getsonata();
		}
		else {
			Fasttrack f=(Fasttrack)w;
			f.getFasttrack();
		}
		}
	}
}
