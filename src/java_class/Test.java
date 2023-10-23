package java_class;

 
public class Test {
public static void main(String[] args) {
	Employee e1=new Employee("Rahul",25000);
	Employee e2=new Employee("yash",32000);
	Bike b1=new Bike("R15",22500);
	Bike b2=new Bike("z900",1114000);
	Watch w1=new Watch("Titan","white",2500);
	Watch w2=new Watch("Sonata","yellow",1000);
	
	Object x[]= {b1,b2,e1,e2,w1,w2};  // this is upcasting
	for(int i=0;i<x.length;i++) {
		if(x[i] instanceof Bike) {
			Bike b=(Bike)x[i];// this is downcasting for bike
		System.out.println(b.name+ " "+b.price);
		}
		else if(x[i] instanceof Employee)
		{
			Employee e=(Employee)x[i];
			System.out.println(e.name+" "+e.salary); // this is downcasting of Employee
		}
		else {
			Watch w=(Watch)x[i];
			System.out.println(w.name+" "+w.color+" "+w.price);
		}
	}
}
}
