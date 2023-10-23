package Interview_question;

public class Binary_decimal_and_reverse {

public static int pow(int  b, int p) {
	int res=1;
	for(int i=1;i<=p;i++) {
		res*=b;
	}
	return res;
}
	public static int deci_bin(int n) {	
	int res=0;
	int i=0;
	while(n>0) {
	   int last=n%2;
	   res=(pow(10,i))*last+res;
	   i++;
	   n/=2;
	}
	 
	return res;
}
	
	public static int bin_deci(int n) {
		int res=0;
		int i=0;
		while(n>0) {
			int last=n%10;
			res=(pow(2,i))*last+res;
           i++;
           n/=10;
		}
	 
		return res;
	}
public static void main(String[] args) {
	System.out.println(deci_bin(15));
	System.out.println(bin_deci(1111));
}
}
