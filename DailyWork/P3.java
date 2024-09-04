
//sum of the first N natural numbers.
import java.util.*;
class Demo2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the natural number upto which you want sum: ");
	int num = sc.nextInt();
	int sum = 0;

	for(int i = 1; i<=num; i++){
		sum=sum + i;
	}
	System.out.println("Sum = " +sum);


	
	}

}
