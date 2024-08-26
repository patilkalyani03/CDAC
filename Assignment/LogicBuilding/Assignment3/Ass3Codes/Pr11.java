//Write a Java program to demonstrate the use of both pre-increment 
//and post-decrement operators in a single expression

import java.util.*;
class Demo{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int result = num++ + --num + ++num + num--;
		
		System.out.println("Num After operation : "+ num);
		System.out.println("Value of Result : "+ result);
			
	}
}
        
		
		
		