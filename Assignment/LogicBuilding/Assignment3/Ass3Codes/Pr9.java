//Write a program to find and print the largest digit in the number 4825. 

import java.util.*;
class LargestNum{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int larNum = 0;
        
        while (num > 0) {
			int n1 = num % 10;
			if(n1 > larNum){
				larNum = n1;
				
			}
            num = num / 10;
        }
		System.out.println("The largest num is: " + larNum);
	    
	}
}	
 
	
/*int number = 4825;
        int largestDigit = 0;

        // Loop to find the largest digit
        while (number > 0) {
            // Extract the last digit
            int digit = number % 10;
            
            // Check if the current digit is larger than the largestDigit
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            
            // Remove the last digit
            number /= 10;
        }
        
        // Print the largest digit
        System.out.println("The largest digit is: " + largestDigit);*/
		