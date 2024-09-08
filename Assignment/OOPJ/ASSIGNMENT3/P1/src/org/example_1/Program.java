/*Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
2.	Calculate the monthly payment using the standard mortgage formula:
o	Monthly Payment Calculation:
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method
3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
Define class LoanAmortizationCalculator with methods acceptRecord, calculateMonthlyPayment & printRecord and test the functionality in main method.
*/

package org.example_1;
import java.util.Scanner;
class LoanAmortizationCalculator {
	private double principal;
	private double i;
	private int y;
	
	public void acceptRecord() {

			Scanner sc = new Scanner(System.in);
			System.out.print("enter the Loan amount : ");
			 principal = sc.nextDouble();
			System.out.print("Enter the annual interest rate : ");
			 i = sc.nextDouble();
			System.out.print("Enter the term of loan in years :");
			 y = sc.nextInt();
			 
			 sc.close();

		}

		public double calculateMonthlyPayment() {
			double monthlyInterestRate = i / 12 / 100;
			double numberOfMonths = y * 12;
			double monthlyPayment = (principal * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfMonths)))
					/ (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1));
			return monthlyPayment;

		}

		public void printRecord() {
			double monthlyPayment = calculateMonthlyPayment();
			double totalPayment = (monthlyPayment * y * 12);

			System.out.println("monthlyPayment: " + monthlyPayment);
			System.out.println("TotalPayment: " + totalPayment);
		}

	}

	public class Program {
		public static void main(String[] args) {
			LoanAmortizationCalculator ref = new LoanAmortizationCalculator();
			ref.acceptRecord();
			ref.printRecord();

	}
	
}



