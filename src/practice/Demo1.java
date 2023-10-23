package practice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Demo1 {

	public static void main(String[] args) {
  ArrayList rcb=new ArrayList();
  
  rcb.add("Virat");
  rcb.add("Siraj");
  rcb.add("Maxewell");
  rcb.add("Faf");

  System.out.println("Iterator methods");
 Iterator x=rcb.iterator();
 
 while(x.hasNext()) {
	 System.out.println(x.next());
 }
System.out.println();
 System.out.println("List Iterator methods");
 ListIterator y=rcb.listIterator(rcb.size());
	while(y.hasPrevious()) {
		System.out.println(y.previous());
  
	}
	
	}
	
}

