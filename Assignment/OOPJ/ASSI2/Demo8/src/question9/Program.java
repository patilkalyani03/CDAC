//Declare variables of each primitive type as fields of a class and check their default values. 
//(Note: Default values depend on whether the variables are instance variables or static variables).

package question9;

public class Program {
	
		   static int i; 
		   static float f; 
		   static double d; 
		   static boolean b;
		   static long l;
		   static byte y;
		
	public static void main(String[] args) {
		System.out.println(" int : "+i);
		System.out.println(" float : "+f);
		System.out.println(" double : "+d);
		System.out.println(" boolean :"+b);
		System.out.println(" long :"+l);
		System.out.println(" byte: "+b);
		
	}

}
/*Output:int : 0
 float : 0.0
 double : 0.0
 boolean :false
 long :0
 byte: false
*/
