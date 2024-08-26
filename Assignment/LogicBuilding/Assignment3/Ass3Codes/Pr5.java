//Write a program to print the Fibonacci sequence up to the number 21.

import java.util.*;
class FiboSequence{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the limit : ");
	int limit = sc.nextInt();
    int n1 = 0,n2 = 1, n3;

    System.out.println("Fibonacci sequence : ");
	
	while(n1 <= limit){
		System.out.println(n1 +" ");
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		
	}
     
	
}
}
	