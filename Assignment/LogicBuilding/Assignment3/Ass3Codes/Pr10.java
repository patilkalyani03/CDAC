//Write a program to print all even numbers between 1 and 50. 

import java.util.*;
class EvenNum{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  start number : ");
		int start = sc.nextInt();
		System.out.println("Enter the end number : ");
		int end = sc.nextInt();
		
		System.out.println("Tne even numbers between "+start+" and "+end+" are: ");
		for(int i = start; i<=end; i++){
			if(i%2==0){
				System.out.print(i + ",");
			}
		}
		
	}
}
        