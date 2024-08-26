
public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num = 10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 
// Error to investigate: Why does the loop execute indefinitely? What is 
//wrong with the loop condition?

//ANSWER
//the loop execute indefinitely because in while loop we assign value to it
//not comparison and it will result true in condition.

//CORRECTED CODE
public class CorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num > 0) { 
            System.out.println(num); 
            num--; 
        } 
    } 
}