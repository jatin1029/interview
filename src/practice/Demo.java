package practice;
import java.util.*;

 class Bike {
String name,color;
int price;

 public Bike(String name, String color,int price) {

	this.name = name;
	this.color = color;
    this.price=price;
}

 
}
class Student{

	String name,qualification;
	int yop;
	public Student(String n, String q,int y) {
		this.name=n;
		this.qualification=q;
		this.yop=y;
	}
}
 public class Demo{

public static void main(String[] args) {
	LinkedList ls=new LinkedList();
//	Bike b1=new Bike("z-900","green",120000);
//	Bike b2=new Bike("Ducati","white",130000);
//    Bike b3=new Bike("Rmz","green",150000);
//    
//    Student s1=new Student("Rahul","B.tech",2023);
//    Student s2=new Student("Ram","Bsc",2022);
//    Student s3=new Student("Anni","BCA",2023);
//   
//	ls.add(b1);
//	ls.add(b2);
//	ls.add(b3);
//	ls.add(s1);
//	ls.add(s2);
//	ls.add(s3);
	
	// There are two method to do this first directly do with linked list 
	// and second is to convet it a array then iterate loop 
	ls.add(new Bike("z-900","green",120000));
	ls.add(new Bike("Ducati","white",130000));
	ls.add(new Bike("Rmz","green",150000));
	ls.add(new Student("Rahul","B.tech",2023));
	ls.add(new Student("Ram","Bsc",2022));
	ls.add(new Student("Anni","BCA",2023));
	

	//1
	for(int i=0;i<ls.size();i++) {
	 if(ls.get(i) instanceof Bike) {
		 Bike b=(Bike)ls.get(i);
		 System.out.println(b.name+" "+b.color+" "+b.price);
 
 	 }
	 else
	 {
		 Student s=(Student)ls.get(i);
		 System.out.println(s.name+" "+s.qualification+" "+s.yop);
		 
	 }
			
		}
	System.out.println();
	
	//2
	for(int i=0;i<ls.size();i++) {
		  if(ls.get(i) instanceof Student) {
			  Student s=(Student)ls.get(i);
			  if(s.yop==2023)
			  {
				  System.out.println(s.name+" "+s.qualification+" "+s.yop);
			  }
		  }
				
			
	}
	System.out.println( );
	//3
	 
	for(int i=0;i<ls.size();i++) {
		if(ls.get(i) instanceof Bike) {
			Bike b=(Bike)ls.get(i);
			
			if(b.color.equalsIgnoreCase("green")) {
				
				System.out.println(b.name+" "+b.color+" "+b.price);
			}
		}
	}
}

}

