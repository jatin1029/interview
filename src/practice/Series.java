package practice;

public class Series {
public static void series_1(int n) {
//	1 4 7 10 13 16 19 22 25 28 
   int num=1;
	for(int i=1;i<=n;i++) {
		System.out.print(num+" ");
		num+=3;
	}
	System.out.println();
}
 

public static void series_2(int n) {
//	1 3 6 10 15 21 28 36 45 55 
	int num=1;
	int  j=2;
	for(int i=1;i<=n;i++) {
		System.out.print(num+" ");
		num+=j;
		j++;
	}
	System.out.println();
}

public static void series_3(int n) {
	int num=2;
	int pro=13;
	for(int i=1;i<=n;i++)
{
		System.out.print(num+" ");
		if(i==1) {
			num+=pro;
		}
		else {
			num+=pro*i;
		}
		}
}
//Q1.circular prime number
public static int count(int n) {
	int c=0;
	while(n>0) {
		c++;
		n/=10;
	}
	return c;
}

public static boolean is_prime(int n) {
	if(n<=1)
		return false;
	else if(n==2 || n==3)
		return true;
	else if (n%2==0 || n%3==0)
		return false;
	
	for(int i=5;i<=Math.sqrt(n);i+=2) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}

public static int pow(int b,int p) {
	int res=1;
	for(int i=1;i<=p;i++) {
		res*=b;
	}
	return res;
}

public static boolean circular(int n) {
	int num=n;
	int c=0;
	while(num>0) {
		c++;
		num/=10;
	}
	for(int i=1;i<=count(n);i++) {
		if(is_prime(n)) {
			int n1=n%10;
			int n2=n/10;
			n=n1*pow(10,c-1)+n2;
		}
		else
		{
			return false;
		}
	}
	return true;
	
}
//Q2.check nth even fibo 
// n=3 fibo is 34
public static int fibo(int n) {
	int n1=1;
	int n2=1;
	int c=0;
	int n3=0;
	while(true) {
		n3=n1+n2;
		if(n3%2==0) {
			c++;
		}
		if(c==n) {
			break;
		}
     n1=n2;
     n2=n3;
	}
	return n3;
}

//Q3.palindrome
public static boolean palindrome(int n) {
	int num=n;
	int res=0;
    while(num>0) {
    	int last=num%10;
    	res=(res*10)+last;
    	num/=10;
    }
    if(n==res) {
    	return true;
    }
    else {
    	return false;
    }
}
public static void main(String[] args) {
//	series_1(10);
//    series_2(10);
//    series_3(10);
//    System.out.println(fibo(3));
//    System.out.println(circular(1932));
    System.out.println(palindrome(122));
}
}
