
//Check weather it is leap year or not.
import java.util.*;
class Demo7{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the year: ");
	int n = sc.nextInt();

	if(n%4==0 && n%100!=0 || n%400==0){
		System.out.println("Leap year.");
	}else{
		System.out.println("Not a leap year.");
	}

	
	}

}

