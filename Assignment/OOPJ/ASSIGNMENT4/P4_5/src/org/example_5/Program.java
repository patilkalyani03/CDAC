package org.example_5;

import java.util.Scanner;

class TollBoothRevenueManager {
	private double carTollRate;
	private double truckTollRate;
	private double motorcycleTollRate;
	private int carCount;
	private int truckCount;
	private int motorcycleCount;

	public double getCarTollRate() {
		return carTollRate;
	}

	public void setCarTollRate(double carTollRate) {
		this.carTollRate = carTollRate;
	}

	public double getTruckTollRate() {
		return truckTollRate;
	}

	public void setTruckTollRate(double truckTollRate) {
		this.truckTollRate = truckTollRate;
	}

	public double getMotorcycleTollRate() {
		return motorcycleTollRate;
	}

	public void setMotorcycleTollRate(double motorcycleTollRate) {
		this.motorcycleTollRate = motorcycleTollRate;
	}

	public int getCarCount() {
		return carCount;
	}

	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}

	public int getTruckCount() {
		return truckCount;
	}

	public void setTruckCount(int truckCount) {
		this.truckCount = truckCount;
	}

	public int getMotorcycleCount() {
		return motorcycleCount;
	}

	public void setMotorcycleCount(int motorcycleCount) {
		this.motorcycleCount = motorcycleCount;
	}

	public void setTollRates() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the toll rate for Car (₹): ");
		setCarTollRate(scanner.nextDouble());

		System.out.print("Enter the toll rate for Truck (₹): ");
		setTruckTollRate(scanner.nextDouble());

		System.out.print("Enter the toll rate for Motorcycle (₹): ");
		setMotorcycleTollRate(scanner.nextDouble());
	}

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of Cars passing through: ");
		setCarCount(sc.nextInt());

		System.out.print("Enter the number of Trucks passing through: ");
		setTruckCount(sc.nextInt());

		System.out.print("Enter the number of Motorcycles passing through: ");
		setMotorcycleCount(sc.nextInt());
	}

	public double calculateRevenue() {
		return (getCarCount() * getCarTollRate()) + (getTruckCount() * getTruckTollRate())
				+ (getMotorcycleCount() * getMotorcycleTollRate());
	}

	public void printRecord() {
		int totalVehicles = getCarCount() + getTruckCount() + getMotorcycleCount();
		double totalRevenue = calculateRevenue();

		System.out.println("\nToll Booth Report:");
		System.out.println("Total number of vehicles: " + totalVehicles);
		System.out.printf("Total revenue collected: ₹%.2f\n", +totalRevenue);
	}

}

public class Program {
	public static void main(String[] args) {
		TollBoothRevenueManager t = new TollBoothRevenueManager();

		t.setTollRates();
		t.acceptRecord();
		t.printRecord();
	}
}
/*Output:
Enter the toll rate for Car (₹): 150
Enter the toll rate for Truck (₹): 350
Enter the toll rate for Motorcycle (₹): 90
Enter the number of Cars passing through: 12
Enter the number of Trucks passing through: 9
Enter the number of Motorcycles passing through: 18

Toll Booth Report:
Total number of vehicles: 39
Total revenue collected: ₹6570.00
*/
