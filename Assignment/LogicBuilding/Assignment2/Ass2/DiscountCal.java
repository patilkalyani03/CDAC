import java.io.*;

public class DiscountCal {
   public static void main(String args[]) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Enter the total purchase amount (in Rs.): ");
       double totalP = Double.parseDouble(br.readLine());

       System.out.println("Do you have a membership card? (y/n): ");
       char m = br.readLine().charAt(0);

       double discount = 0;

       if (totalP >= 1000) {
           discount = 20;
       } else if (totalP >= 500) {
           discount = 10;
       } else {
           discount = 5;
       }

       if (m == 'y') {  
           discount += 5;
       }

       double discountAmt = (discount / 100) * totalP;
       double finalAmt = totalP - discountAmt;
	   
       System.out.println("Total Purchase is Rs." + totalP);
       System.out.println("Discount applied: " + discount + "%");
       System.out.println("Discount amount: Rs." + discountAmt);
       System.out.println("Final amount to pay: Rs." + finalAmt);
   }
}