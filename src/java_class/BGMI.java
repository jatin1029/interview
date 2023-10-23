package java_class;

public class BGMI {

	Granade getgranade() {
		Granade g1=new Granade();
		return g1;
	}
	
   Gun getgun() {
	Gun p1=new Gun();
	return p1;
   }
   
   public static void main(String[] args) {
	BGMI b1=new BGMI();
	Granade g=b1.getgranade();
	System.out.println(g);
	Gun x=b1.getgun();
	System.out.println(x);
}
}

