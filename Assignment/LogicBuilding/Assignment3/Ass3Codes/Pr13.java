//Pattern Code

import java.util.*;
class Pat3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number : ");
		int start = sc.nextInt();
		System.out.println("Enter the end number : ");
		int end = sc.nextInt();
		
		for (int i = start; i <= end; i++) {
            for (int j = start; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println(); 
        }

        for (int i = end; i >= (start+1); i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println(); 
        }	
	}
}



		