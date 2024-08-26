//Write a program to print all multiples of 7 between 1 and 100. 

import java.util.*;
class Multiple{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Start Number: ");
	int num1 = sc.nextInt();
	System.out.println("Enter the End Number : ");
	int num2 = sc.nextInt();
	
	System.out.println("Enter the Number : ");
	int n = sc.nextInt();
	
	System.out.println("The multiple of "+n+" are:");
	
	for(int i = num1; i<=num2; i++){
		if(i % n == 0){
			System.out.println(i);
		}
	}
}
}
	
	