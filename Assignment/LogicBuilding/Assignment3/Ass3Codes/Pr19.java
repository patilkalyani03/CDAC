//Pattern Code

import java.util.*;
class Pat9{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				if(j < i){
					System.out.print("*");
				}	
			}
			System.out.println();
		}
			
	}
}
        

 /*for (int i = rows; i >= 1; i--) {
    // Print leading spaces
    for (int j = rows; j > i; j--) {
        System.out.print(" ");
    }
    // Print stars with spaces in between
    for (int k = 1; k <= i; k++) {
        System.out.print("* ");
    }
    // Move to the next line
    System.out.println();
}*/		
	
		