//Write a program to calculate the sum of the first 50 natural numbers.

import java.util.*;
class NaturalNum{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Natural no. upto which you want addition:");
	int num = sc.nextInt();
	int sum = 0;
	
	for(int i = 1; i<=num; i++){
		sum = sum + i;
	}
	
	System.out.println("The Sum of First 50 natural Numbers is: "+ sum);
	

}
}