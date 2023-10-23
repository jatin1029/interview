package java_class;
import java.util.*;

public class rakesh {
	public static long print(int n)
	{
		long res=1;
		for(int i=n;i>=1;i--)
		{
			res=res*1;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
		sc.close();

	}

}
