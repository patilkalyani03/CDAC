
 public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
	int count = 5; 
    while (count = 0) { 
	    System.out.println(count); 
        count--; 
    } 
   } 
} 
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
//`while` loop

//ANSWER
//it is not checking count rather is assigning 0 ito count so the condition
//will false. and because of false condition it will not enter in body and
//will not print statement.

//CORRECTED CODE
public class CorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count > 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
}

