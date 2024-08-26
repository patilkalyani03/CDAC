//Write a program to reverse the digits of the number 1234.
//The output should be 4321.

import java.util.*;
class ReverseNum{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num = sc.nextInt();
	int revNum = 0;
	
	while (num != 0){
            int temp = num % 10;
            revNum = revNum * 10 + temp;
            num  = num / 10;
	}
	System.out.println("Reverse Number is: " +revNum);
}
}
	
	