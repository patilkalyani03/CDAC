package question2;

//b. Write a program to test how many bytes are used to represent a byte value using 
//the BYTES field. (Hint: Use Byte.BYTES).
public class Part2 {
	/*public static void main(String[] args) {
		byte b = Byte.BYTES;
		System.out.println(b);
		
	}
Output : 1


//c. Write a program to find the minimum and maximum values of byte using the MIN_VALUE 
//and MAX_VALUE fields. (Hint: Use Byte.MIN_VALUE and Byte.MAX_VALUE).
	
	public static void main(String[] args) {
		byte a = Byte.MIN_VALUE;
		byte b = Byte.MAX_VALUE;
		System.out.println(a);
		System.out.println(b);
		
	}
Output : -128 
          127
   

//d. Declare a method-local variable number of type byte with some value and 
//convert it to a String using the toString method. (Hint: Use Byte.toString(byte)).
	
	public static void main(String[] args) {
		byte number = 5;
		String str = Byte.toString(number);
		System.out.println(str);
	}
Output : 5

	
//e. Declare a method-local variable strNumber of type String with some value and 
//convert it to a byte value using the parseByte method. (Hint: Use Byte.parseByte(String)).

	public static void main(String[] args) {
		String strNumber = "123";
		byte b = Byte.parseByte(strNumber);
		System.out.println(b);
	}
//Output : 123
//but when we will give value greater the size it will give java.lang.NumberFormatException

	
//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" 
//and attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).

	public static void main(String[] args) {
		String strNumber = "Ab12Cd3";
		byte b = Byte.parseByte(strNumber);
		System.out.println(b);
	}
//java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//at java.base/java.lang.Integer.parseInt(Integer.java:588) 

	
//g. Declare a method-local variable number of type byte with some value and convert it 
//to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(byte)).
	
	public static void main(String[] args) {
		byte number = 10;
		double a = Byte.valueOf(number);
		System.out.println(a);
	}
Output : 10.0


//h. Declare a method-local variable strNumber of type String with some byte value and 
//convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(String)).
	
	public static void main(String[] args) {
		String strNumber = "123";
		byte b = Byte.valueOf(strNumber);
		System.out.println(b);
	}
Output : 123
But if try to convert it n char it will give error.

	
//i. Experiment with converting a byte value into other primitive types 
//or vice versa and observe the results.
	*/
	public static void main(String[] args) {
		byte b = 10;
		int a = Byte.valueOf(b);
		System.out.println(a);
	}
//Output : 10
//it will give output for all except char.
}
