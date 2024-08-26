import java.io.*;
public class WeekDays{
   public static void main(String args[])throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("Enter the Number:\n (1.Monday, 2.Tuesday, 3.Wednesday, 4.Thursday, 5.Friday, 6.Saturday, 7.Sunday):");
        
	   int day = Integer.parseInt(br.readLine());
	   
	   switch(day){
		   case 1:
		        System.out.println("Monday");
				System.out.println("Its a weekday");
				break;
			
			case 2:
			    System.out.println("Tuesday");
				System.out.println("Its a weekday");
				break;
			
			case 3:
			    System.out.println("Wednesday");
				System.out.println("Its a weekday");
				break;
			
			case 4:
			    System.out.println("Thursday");
				System.out.println("Its a weekday");
				break;
			
			case 5:
			    System.out.println("Friday");
				System.out.println("Its a weekday");
				break;
			
			case 6:
			    System.out.println("Saturday");
				System.out.println("Its a weekend");
				break;
			
			case 7:
			    System.out.println("Sunday");
				System.out.println("Its a weekend");
				break;
				
			default:
			    System.out.println("Invalid Input");
				break;
	   }
			
		     
	}
	
}