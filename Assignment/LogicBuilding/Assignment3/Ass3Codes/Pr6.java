//Write a program to find and print the first 5 prime numbers.

import java.util.*;
class PrimeNum{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	    int n = 2;
		int count = 0;
		System.out.println("Enter count how many prime number you want : ");
		int num = sc.nextInt();
		
		System.out.println("The prime Numbers are : ");
		while(count < num){
			int flag = 0;
			
			for(int i = 2; i<= n/2; i++){
				if(n % i == 0){
					flag = 1;
					break;
				}
			}
			if(flag ==0){
				System.out.println(n);
				count++;
			} 
			n++;
			
		}
	}
}	
 
	
