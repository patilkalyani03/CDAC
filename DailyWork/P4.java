
//Sum of N natural numbers.
import java.io.*;
class Demo3{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number: ");
	int num = Integer.parseInt(br.readLine());
	int sum = 0;

	for(int i=1; i<=num; i++){
		sum=sum + i;
	}
	System.out.println("Sum = " +sum);

	
	
	}


}
