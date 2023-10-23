package Exception_Handling;

public class Mutliple_Exception {
  public static void main(String[] args) {
	
	  System.out.println("Start");
	  
	  try {
		  System.out.println("outer try");
		try {
			System.out.println("inner try");
			System.out.println(100/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Inner_catch");
			System.out.println("Arithmetic");
		}
		int arr[]= {};
		System.out.println(arr[2]);
		
		  
	  }
	  catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("outer catch");
		  System.out.println("ArrayIndex");
	  }
	  
}
}
