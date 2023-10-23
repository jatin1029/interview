package java_class;

public class Son extends Father {
	
	String girlfriend="Anshika";
	
	void girl() {
	  System.out.println(super.girlfriend);
	}
public static void main(String[] args) {
	Son s1=new Son();
System.out.println(s1.sal);
System.out.println(s1.girlfriend);
   s1.girl();

  }
}
