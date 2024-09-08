//b) Declare a method-local variable status of type boolean with the value true 
//and convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).

package question1;

public class DOCS {
	/*public static void main(String[] args) {
		boolean status = true;
		String statusStr = Boolean.toString(status);
		System.out.println(statusStr);

	}

}

//Output: true


//c) Declare a method-local variable strStatus of type String with the value "true" and convert it 
//to a boolean using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String))
	public static void main(String[] args) {
		String strStatus = "true";
		boolean status = Boolean.parseBoolean(strStatus);
		System.out.println(status);
		
	  
  }
  Output: true
  
  
//d) Declare a method-local variable strStatus of type String with the value "1" or "0" and attempt to 
//convert it to a boolean. (Hint: parseBoolean method will not work as expected with "1" or "0").
	
	public static void main(String[] args) {
		String strStatus = "1";
		boolean status = Boolean.valueOf("1");
		System.out.println(status);
		
	}
Output : 
	
//e) Declare a method-local variable status of type boolean with the value true and convert it to 
//the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(boolean)).	
	
	public static void main(String[] args) {
		boolean status = true;
		boolean b = Boolean.valueOf(status);
		System.out.println(b);
		
		
	}
	Output:true 
	
//f) Declare a method-local variable strStatus of type String with the value "true" and convert it to 
//the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(String)).
	
	public static void main(String[] args) {
		String strStatus = "true";
		boolean b = Boolean.valueOf(strStatus);
		System.out.println(b);
	}
Output: true
	
//g) Experiment with converting a boolean value into other primitive types 
//or vice versa and observe the results.
	
	public static void main(String[] args) {
		boolean status = true;
		int a = Boolean.parseInt(status);
		System.out.println(a);
	}
	
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method parseInt(boolean) is undefined for the type Boolean

	at Demo/Democ.DOCS.main(DOCS.java:66) */
}