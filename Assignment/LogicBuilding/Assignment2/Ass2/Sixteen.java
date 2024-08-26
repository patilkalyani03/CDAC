 class Main { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
}


//Compilation Error:
//error: incompatible types: possible lossy conversion from double to int
//We are doing Arithmetic operation on two different datatypes thats not possible
//it is not allowed.