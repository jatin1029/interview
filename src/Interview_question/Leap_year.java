package Interview_question;

public class Leap_year {
public static boolean leap(int year) {
	
	if((year%4==0 && year%100!=0) || year%400==0) {
		return true;
	}
	else {
		return false;
	}
	
}
public static void main(String[] args) {
   System.out.println(leap(2003));
}
}
