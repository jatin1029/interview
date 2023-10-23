package practice;

public class Array_check_prime {
public static boolean is_prime(int n) {
	if(n<=1) {
		return false;
	}
	
	else if(n==2 || n==3) {
		return true;
	}
	else if (n%2==0 || n%3==0) {
		return false;
	}
	
	for(int i=5;i<=Math.sqrt(n);i+=2) {
   if(n%i==0) {
	   return false;
   }
   
}
	return true;
}

public static void check (int n[] ){
     for(int i=0;i<n.length;i++) {
    	  
    	 if(is_prime(n[i])){
    		 System.out.print(n[i]+ " ");
    	 }
     }
}

public static void main(String[] args) {
//	int arr[]=new int [4];
	int arr[]= {2,12,11,17};
	check(arr);
}
}
