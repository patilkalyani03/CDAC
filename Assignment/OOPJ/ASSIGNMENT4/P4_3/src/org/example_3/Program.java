package org.example_3;
import java.util.Scanner;

class BMITracker{
	float weight;
	float height;
	float BMI;
	
	
	
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getBMI() {
		return (getWeight() / (getHeight() * getHeight()));
	}
	public void setBMI(float bMI) {
		BMI = bMI;
	}
	public void acceptRecord(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the weight in (kg) :    ");
	setWeight(sc.nextFloat());
	System.out.print("Enter the height in (meter) :       ");
	setHeight(sc.nextFloat());
	sc.close();
	}
    	
    public void classifyBMI() {
    	
    	
    	if (BMI < 18.5)
			System.out.println("You Are Under weight.");
			
		else if (BMI>18.5 && BMI<24.9)
			System.out.println("You Are Normal-Weighted.");
		
		else if (BMI>=25)
			System.out.println("You Are over-weight.");
    	
    }
    public void printRecord() {
    	float w = getWeight();
    	float h= getHeight();
    	float bmi = getBMI();
    	System.out.println("Weight (kg)       :   "+w);
    	System.out.println("height (meter)    :  " +h);
    	System.out.println("BMI is            :  "+bmi);
    	
    	
    }
	
}

public class Program {
	public static void main(String[] args) {
		BMITracker bm = new BMITracker();
		bm.acceptRecord();
		bm.classifyBMI();
		bm.printRecord();
		

	}

}
/*Output:
Enter the weight in (kg) :    55
Enter the height in (meter) :       1.67
You Are Under weight.
Weight (kg)       :   55.0
height (meter)    :  1.67
BMI is            :  19.721037
*/

