package practice;

public class Anonymous implements Iterator {
	@Override
	 public void m1() {
		System.out.println("m1-method");
	}
	
	@Override
	public void m2() {
		System.out.println("m2-method");
	}
	
	@Override
	 public void m3() {
		System.out.println("m3-method");
	}

}

class Anonymous2 implements ListIterator{
	@Override
	 public void m1() {
		System.out.println("m1-method");
	}
	
	@Override
	public void m2() {
		System.out.println("m2-method");
	}
	
	@Override
	 public void m3() {
		System.out.println("m3-method");
	}
	
	@Override 
	public void l1() {
		System.out.println("l1-method");
	}
	
	@Override
	public void l2() {
		System.out.println("l2-method");
	}
}
