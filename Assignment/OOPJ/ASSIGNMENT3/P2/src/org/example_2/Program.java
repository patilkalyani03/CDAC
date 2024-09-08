package org.example_2;
import java.util.Scanner;
class CompoundInterestCalculator {
	
	double  annualInterestRate ;
	double  numberOfCompounds;
	int years;
	double principal;
	double futureValue, totalInterest;
	
	public void acceptRecord() {
		Scanner sc = new Scanner (System.in);	
		
		System.out.print("enter Annual interest Rate : ");
		annualInterestRate= sc.nextDouble();
		System.out.print("Enter number of compounds  : ");
		numberOfCompounds=sc.nextDouble();
		System.out.print("Enter the years            : ");
		years= sc.nextInt();
		System.out.print("enter the compound         : ");
		principal = sc.nextDouble();
		
		sc.close();
		
	}
	public void calculateFutureValue() {
		futureValue = (principal * (1 + annualInterestRate / Math.pow(annualInterestRate, numberOfCompounds)) * years);
         totalInterest = futureValue - principal;
	}
	
	public void printRecord() {
		System.out.println("Future Value         : "+futureValue);
		System.out.println("Total interest erned : ₹" +totalInterest);
	}
	
	
}

public class Program {
	public static void main(String[] args) {
		CompoundInterestCalculator CI= new CompoundInterestCalculator();
		CI.acceptRecord();
		CI.calculateFutureValue();
		CI.printRecord();
		
	}

}
