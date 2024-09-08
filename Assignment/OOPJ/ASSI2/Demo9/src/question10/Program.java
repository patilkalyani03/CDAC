//Write a program that accepts two integers and an arithmetic operator (+, -, *, /) from the command line. 
//Perform the specified arithmetic operation based on the operator provided. 
//(Hint: Use switch-case for operations).

package question10;

public class Program {
	public static void main(String[] args) {
		if (args.length != 3) {
            System.out.println("Usage: java Program <n1> <operator> <n2>");
            return;
        }
        int n1 = Integer.parseInt(args[0]);
        char operator = args[1].charAt(0);
        int n2 = Integer.parseInt(args[2]);
        
        int res;
        switch (operator) {
            case '+':
                res = n1 + n2;
                System.out.println("Result: " + res);
                break;
            case '-':
                res = n1 - n2;
                System.out.println("Result: " + res);
                break;
            case '*':
                res = n1 * n2;
                System.out.println("Result: " + res);
                break;
            case '/':
                if (n2 != 0) {
                    res = n1 / n2;
                    System.out.println("Result: " + res);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }

   	}

}
