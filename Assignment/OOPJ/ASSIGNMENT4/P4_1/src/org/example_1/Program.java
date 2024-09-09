package org.example_1;

import java.util.Scanner;
class LoanAmortizationCalculator {
	private double principal;
	private double i;
	private int y;
	double monthlyInterestRate;
	double numberOfMonths;
	double monthlyPayment;
	double totalPayment;

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getI() {
		return i;
	}

	public void setI(double i) {
		this.i = i;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getMonthlyInterestRate() {
		return i / 12 / 100;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getNumberOfMonths() {
		return y * 12;
	}

	public void setNumberOfMonths(double numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public double getMonthlyPayment() {
		return (getPrincipal()
				* (getMonthlyInterestRate() * (Math.pow(1 + getMonthlyInterestRate(), getNumberOfMonths())))
				/ (Math.pow(1 + getMonthlyInterestRate(), getNumberOfMonths()) - 1));
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public void acceptRecord() {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the Loan amount : ");
		setPrincipal(sc.nextDouble());
		System.out.print("Enter the annual interest rate : ");
		setI(sc.nextDouble());
		System.out.print("Enter the term of loan in years :");
		setY(sc.nextInt());

	}

	public void printRecord() {
		double monthlyPayment = getMonthlyPayment();
		double total = getTotalPayment();
		System.out.println("monthlyPayment: " + monthlyPayment);
		System.out.println("TotalPayment: " + total);
	}

	public double getTotalPayment() {
		return getMonthlyPayment() * getY() * 12;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}

}

public class Program {
	public static void main(String[] args) {
		LoanAmortizationCalculator ref = new LoanAmortizationCalculator();
		ref.acceptRecord();
		ref.printRecord();

	

	}

}

/*Output:
enter the Loan amount : 20000
Enter the annual interest rate : 5
Enter the term of loan in years :2
monthlyPayment: 877.4277946813719
TotalPayment: 21058.267072352926

*/
