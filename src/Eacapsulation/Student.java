package Eacapsulation;

public class Student {
private String name;
private int age;
private double perc;
 
public void setName(String n) {
	this.name=n;
}
public void setAge(int a) {
	if(a>=1 && a<=100) {
		this.age=a;
	}
	else {
		System.out.println("Inavalid age");
	}
}

public void setPercentage(double p) {
     if(p>=0 && p<=100) {
    	 this.perc=p;
     }
     else {
    	 System.out.println("Invalid percentage");
     }
}

public String getName() {
	return this.name;
}
public int getAge() {
	return this.age;
}
public double getPercentage() {
	return this.perc;
}

public static void main(String[] args) {
	Student s1=new Student();
	s1.setName("Ashwin");
	s1.setAge(40);
	s1.setPercentage(80.99);
	System.out.println(s1.getName());
	System.out.println(s1.getAge());
	System.out.println(s1.getPercentage());
	
	s1.setAge(45);
	System.out.println("Updated age"+s1.getAge());
	
	}
}
