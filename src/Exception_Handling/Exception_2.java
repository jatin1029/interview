
package Exception_Handling;
 
public class Exception_2 {
// Here we code for Throwable class it is parent class of Excetpion
	// If we don't know the exception name then we use Throwable class
	
	void arr(int arr[]) {
		try {
			System.out.println("try");
			System.out.println(arr[3]);
		}
		
		// Here we use throwable if we dont know the name of risky code
		catch(Throwable e) {
		   System.out.println("Run time error");	
		}
	}
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n");
//		int n=sc.nextInt();
		
	  Exception_2 e1=new  Exception_2();
	 int arr[]=new int[2];
	        e1.arr(arr);
	}
}
