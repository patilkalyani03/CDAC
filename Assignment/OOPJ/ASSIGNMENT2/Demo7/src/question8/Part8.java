package question8;
import java.util.Scanner;

public class Part8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter a boolean: ");
        boolean b = sc.nextBoolean();

        System.out.print("Enter a long: ");
        long l = sc.nextLong();

        System.out.print("Enter a short: ");
        short s = sc.nextShort();

        System.out.print("Enter a byte: ");
        byte a = sc.nextByte();

        String intToString = Integer.toString(n);
        String floatToString = Float.toString(f);
        String doubleToString = Double.toString(d);
        String charToString = Character.toString(ch);
        String booleanToString = Boolean.toString(b);
        String longToString = Long.toString(l);
        String shortToString = Short.toString(s);
        String byteToString = Byte.toString(a);

        String intToStringValueOf = String.valueOf(n);
        String floatToStringValueOf = String.valueOf(f);
        String doubleToStringValueOf = String.valueOf(d);
        String charToStringValueOf = String.valueOf(ch);
        String booleanToStringValueOf = String.valueOf(b);
        String longToStringValueOf = String.valueOf(l);
        String shortToStringValueOf = String.valueOf(s);
        String byteToStringValueOf = String.valueOf(a);

        System.out.println("Using toString() method:");
        System.out.println("int: " + intToString);
        System.out.println("float: " + floatToString);
        System.out.println("double: " + doubleToString);
        System.out.println("char: " + charToString);
        System.out.println("boolean: " + booleanToString);
        System.out.println("long: " + longToString);
        System.out.println("short: " + shortToString);
        System.out.println("byte: " + byteToString);
        
        System.out.println("********************");

        System.out.println("Using String.valueOf() method:");
        System.out.println("int: " + intToStringValueOf);
        System.out.println("float: " + floatToStringValueOf);
        System.out.println("double: " + doubleToStringValueOf);
        System.out.println("char: " + charToStringValueOf);
        System.out.println("boolean: " + booleanToStringValueOf);
        System.out.println("long: " + longToStringValueOf);
        System.out.println("short: " + shortToStringValueOf);
        System.out.println("byte: " + byteToStringValueOf);

        sc.close();
    }
}
/*Output:Enter an integer: 22
Enter a float: 12.59
Enter a double: 668.964
Enter a character: K
Enter a boolean: true
Enter a long: 1685486
Enter a short: 33
Enter a byte: 59
Using toString() method:
int: 22
float: 12.59
double: 668.964
char: K
boolean: true
long: 1685486
short: 33
byte: 59
********************
Using String.valueOf() method:
int: 22
float: 12.59
double: 668.964
char: K
boolean: true
long: 1685486
short: 33
byte: 59
*/
