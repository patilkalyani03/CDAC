//Write a program to compute the factorial of the number 10.

import java.util.*;
class Factorial{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num = sc.nextInt();
	long fact = 1;
	
	for(int i=1; i<=num; i++){
		fact = fact*i;
	}
	System.out.println("Factorial of "+ num +" is : "+fact);
		
	
	

}
}