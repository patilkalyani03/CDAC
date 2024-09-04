
//Sum of the numbers in the given range.

import java.util.*;
class Demo4{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int n1 = sc.nextInt();
	System.out.println("Enter the second number: ");
	int n2 = sc.nextInt();
	int sum = 0;
	
	for(int i = n1; i<=n2; i++){
		sum=sum + i;
	}
	System.out.println("The sum of "+n1+" to "+n2+" is : "+sum);

	}

}
