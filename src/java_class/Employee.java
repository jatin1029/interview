package java_class;

public class Employee {
String name;
int salary;
// consturctor
Employee(String name,int salary){
	this.name=name;
	this.salary=salary;	
}
@Override
public String toString() {
    return getClass().getName() + " Name:" +this.name+" "+"salary: "+this.salary;
// if we have to return a int value then we have to add empty string
}

 public static void main(String[] args) {
	 
	 // These are the object of the class Employee
	Employee e1=new Employee("sonu",25000);
	Employee e2=new Employee("raju",21000);
	Employee e3=new Employee("mohan",22000); 
	Employee e4=new Employee("rohan",23000);
	
	Employee emp[]= {e1,e2,e3,e4};
	for(int i=0;i<emp.length;i++) {
		System.out.println(emp[i]);
	}
	
}

}
class Bike {
	String name;
	int price;
	Bike(String name,int price){
		this.name=name;
		this.price=price;
	}
}
class Watch {
	String name;
	String color;
	int price; 
	public Watch(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
}




