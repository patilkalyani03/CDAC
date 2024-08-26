//Pattern Code

import java.util.*;
class Pat12{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		for (int i = row; i >= 1; i--) {
			for (int j = row; j > i; j--) {
				System.out.print("   ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(" * ");
			}
			System.out.println();
		}
		for (int i = 2; i <= row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print("   ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(" * ");
			}
			System.out.println();
		}
			
	}
}
        

 	
	
		