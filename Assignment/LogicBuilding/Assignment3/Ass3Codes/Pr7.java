//Write a program to calculate the sum of the digits of the number 9876. The output should be 
//30 (9 + 8 + 7 + 6). 

import java.util.*;
class SumOfDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num > 0){
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of Digits : " + sum);
		
	}
}



		