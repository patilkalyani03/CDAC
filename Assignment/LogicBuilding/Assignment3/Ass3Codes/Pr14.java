//Pattern Code

import java.util.*;
class Pat4{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row number : ");
		int row = sc.nextInt();
		
		
		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= (2 * i -1); j++){
                    System.out.print("* ");
			}
			System.out.println();
		}
		
							
	}
}
        
		
	
		