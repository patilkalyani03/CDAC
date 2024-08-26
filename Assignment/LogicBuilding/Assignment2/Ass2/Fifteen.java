 public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 


//Compilation Error:
//error: incompatible types: possible lossy conversion from double to int
//We are doing Arithmetic operation on two different datatypes thats not possible
//it is not allowed.