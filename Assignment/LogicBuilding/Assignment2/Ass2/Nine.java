 public class Main { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
} 

//compilation error 
// error: not a statement
// int class = 10;
 ^
//Nine.java:3: error: ';' expected
//int class = 10;
    ^
//Nine.java:3: error: <identifier> expected
//int class = 10;
          ^
//Nine.java:4: error: illegal start of expression
//System.out.println(class);
                    ^
//Nine.java:4: error: <identifier> expected
//System.out.println(class);
// we cannot used some words as they are already used as the special keyword which 
//were defined in java main source file.