package Interview_question;

public class GCD_LCM {
public static int GCD(int a,int b) {
	
	int gcd=1;
	for(int i=1;i<=a&&i<=b;i++) {
		if(a%i==0 && b%i==0) {
			gcd=i;
		}
	}
	return gcd;
}

public static int LCM (int a,int b) {
	int lcm=a>b?a:b;
	 while(true) {
		 if(lcm%a==0 && lcm%b==0) {
			 break;
		 }
		 else {
			 lcm++;
		 }
	 }
	 return lcm;
}
public static void main(String[] args) {
	System.out.println(GCD(60,75));
	System.out.println(LCM(4,5));
}
}
