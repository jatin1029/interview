package practice;
import java.util.*;

public class Product {
String type,name;
int price;

public Product(String t,String n,int p) {
	this.type=t;
	this.name=n;
	this.price=p;
}
 @Override
public String toString() {
	return this.type+" "+this.name+" "+this.price;
}

public static void main(String[] args) {
	// type is most important
	ArrayList<Product> al=new ArrayList<Product>();
	al.add(new Product("shampoo","Dove",360));
	al.add(new Product("shaMpoo","vatika",340));
	al.add(new Product("soap","pearce",100));
	
	for(Product x:al) {
		System.out.println(x);
	}
	System.out.println();
	
	System.out.println("Answer of first");
	//1
	for(Product x:al) {
	 if(x.type.equalsIgnoreCase("shampoo")) { // equalsIgnoreCase check only string
		 System.out.println(x);
	 }
	}
	 System.out.println();
	 System.out.println("Answer of second");
	//2
	for(Product x:al) {
		 if(x.type.equals("shampoo") && x.name.equals("Dove")) { //equals check string and 
			 System.out.println(x);                              // it also check case upper or lower
		 }
		}
	System.out.println();
	System.out.println("Answer of third");
	//3
	for(Product x:al) {
		 if(x.type.equals("shampoo") &&(x.price>=350 && x.price<=750)  ) {  
			 System.out.println(x);                               
		 }
		}
	
	
//	for(int i=0;i<al.size();i++) {
//		System.out.println(al.get(i));
//	}
}
}
