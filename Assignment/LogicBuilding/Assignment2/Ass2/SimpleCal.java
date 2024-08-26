import java.io.*;
public class SimpleCal{
   public static void main(String args[])throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("Enter the first number :");
	   double n1 = Double.parseDouble(br.readLine());
	   System.out.println("Enter the second number :");
	   double n2 = Double.parseDouble(br.readLine());
	   System.out.println("Enter the Operator: (+, -, *, /)");
	   char operator = br.readLine().charAt(0);
	   double result = 0;
	   
	   switch(operator){
		    case '+':
		        result = n1 + n2;
				break;
		    
			case '-':
		        result = n1 - n2;
				break;
			
			case '*':
		        result = n1 * n2;
				break;
			
			case '/':
		        if(n2 != 0){
					result = n1 / n2;
				}else{
					System.out.println("Error");
					return;
				}
				break;
				
			default:
			    System.out.println("Invalid input");
                break;
	   }
        System.out.println("The Result is :" + result);	  
			
		     
	}
	
}