package practice;

public class Test {
	
	Anonymous iterator() {
		Anonymous a1=new Anonymous();
		return a1;
	}
	
	Anonymous2 listiterator() {
		Anonymous2 l1=new Anonymous2();
		return l1;
	}
public static void main(String[] args) {
	Test t1=new Test();
	 
    Iterator x=t1.iterator();
	x.m1();
	x.m2();
	x.m3();
	
	System.out.println();
	ListIterator y=t1.listiterator();
	y.l1();
	y.l2();
	y.m1();
	y.m2();
	y.m3();
}
}
