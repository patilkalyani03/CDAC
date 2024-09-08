package org.example_4;
import java.util.Scanner;

class DiscountCalculator{
	float discountAmount;
	float originalPrice;
	float discountRate;
	float finalPrice;
	
	public void acceptRecord() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter original price:   ");
		originalPrice=sc.nextFloat();
		System.out.print("Enter Discount rate:     ");
		discountRate= sc.nextFloat();
		
		sc.close();
	}
	public void calculateDiscount() {
		discountAmount = originalPrice * (discountRate / 100);
		finalPrice = originalPrice - discountAmount;
		
	}
	public void printRecord() {
		System.out.println("Original amount is : "+originalPrice);
		System.out.println("Discount rate is   : "+discountRate);
		System.out.println("Discount Amount is : "+discountAmount);
		System.out.println("Final price is     : "+finalPrice);	
	}

}

public class Program {
	public static void main(String[] args) {
		DiscountCalculator dc = new DiscountCalculator();
		dc.acceptRecord();
		dc.calculateDiscount();
		dc.printRecord();
	
	}
}
/*Output:
Enter original price:   20000
Enter Discountrate:     10
Original amount is : 20000.0
Discount rate is   : 10.0
Discount Amount is : 2000.0
Final price is     : 18000.0
*/
