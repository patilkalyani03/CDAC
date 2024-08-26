 class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 


//compilation error
//The String[] args is important in the main method because it is used to pass 
//command-line arguments to the program.
