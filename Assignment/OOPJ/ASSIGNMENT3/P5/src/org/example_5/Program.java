package org.example_5;
import java.util.Scanner;

class TollBoothManager {
    private float carTollRate;
    private float truckTollRate;
    private float bikeTollRate;
    private int carCount;
    private int truckCount;
    private int bikeCount;
    private float totalIncome;

    public void defineTollRates(float carRate, float truckRate, float bikeRate) {
        this.carTollRate = carRate;
        this.truckTollRate = truckRate;
        this.bikeTollRate = bikeRate;
    }

    public void logVehicleCount(int cars, int trucks, int bikes) {
        this.carCount = cars;
        this.truckCount = trucks;
        this.bikeCount = bikes;
    }

    public void computeRevenue() {
        totalIncome = (carCount * carTollRate) + (truckCount * truckTollRate) + (bikeCount * bikeTollRate);
    }

    public void displayReport() {
        int totalVehicles = carCount + truckCount + bikeCount;
        System.out.println("Total number of vehicles that passed: " + totalVehicles);
        System.out.println("Total revenue generated: ₹" + totalIncome);
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TollBoothManager tollBooth = new TollBoothManager();

        System.out.print("Set toll rate for Cars (₹): ");
        float carRate = input.nextFloat();
        System.out.print("Set toll rate for Trucks (₹): ");
        float truckRate = input.nextFloat();
        System.out.print("Set toll rate for Motorcycles (₹): ");
        float bikeRate = input.nextFloat();
        tollBooth.defineTollRates(carRate, truckRate, bikeRate);

        System.out.print("Enter the number of Cars passed: ");
        int carCount = input.nextInt();
        System.out.print("Enter the number of Trucks passed: ");
        int truckCount = input.nextInt();
        System.out.print("Enter the number of Motorcycles passed: ");
        int bikeCount = input.nextInt();
        tollBooth.logVehicleCount(carCount, truckCount, bikeCount);

        tollBooth.computeRevenue();
        tollBooth.displayReport();

        input.close();
    }
}



