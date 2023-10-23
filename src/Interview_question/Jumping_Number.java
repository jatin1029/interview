package Interview_question;

public class Jumping_Number {
public static boolean jumping(int n) {
	while(n>0) {
		int n1=n%10;
		 n/=10;
		  int n2=n%10;
		if( Math.abs(n1-n2)!=1) {
			  if(n2!=0) {
				  return false;
			  }
		 
	         	}		
				 
	    }
	return true;
	

}

public static void main(String[] args) {
              System.out.println(jumping(78985));
}
}
