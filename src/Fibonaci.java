public class Fibonaci
{
	public static void print(int n)
	{
		int n1=0;
		int n2=1;
		int n3=0;
		
		
		for(int i=1;i<=n-2;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
		if(n3%2==0)
		{
			System.out.print(" "+n3);
		}
		else {
			System.out.println(n3+" is not even fibo number");
		}
		
		
		
	}
	

	public static void main(String[] args) {
		print(11);
	}

}
