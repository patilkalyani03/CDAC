//Pattern Code

import java.util.*;
class Pat8{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print("   ");
			}
				for (int k = 1; k <= (2*i-1); k++){
						System.out.print(" * ");
					
				}
			    System.out.println();
		}
		for (int i = row -1; i >= 1; i--) {
			for (int j = row; j > i; j--) {
				System.out.print("   ");
			}
				for (int k = 1; k <= (2*i-1); k++){
						System.out.print(" * ");
					
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
	
		