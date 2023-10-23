package Exception_Handling;

// Multiple  catch block
public class Exception_3 {
public static void main(String[] args) {
	
	
	// If we write like this then we get compilation erro because
	// All time throwable handle error and remaining catch block can't execute
	// So we have write catch block of Throwable exception in last keyword

//	try {
//	   System.out.println("Start");
//	   int arr[]= {};
//	   System.out.println(arr[2]);
//	   System.out.println(100/0);
//	}
//	catch(Throwable e) {
//		System.out.println("there is an error");
//	}
//	catch(ArithmeticException e) 
//		
//	}
//	catch(ArrayIndexOutOfBoundsException e) {
//		
//	}
	
	
	// But here we can handle one exception at a time
	try {
		   System.out.println("Start");
		   int arr[]= {};
		 
  		   System.out.println(arr[2]);
  		  System.out.println(100/0);	
		}
	
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
	
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Index Out of Bound");	
		}
	
	catch(Throwable e) {
		System.out.println("there is an error");
	}
}
}
