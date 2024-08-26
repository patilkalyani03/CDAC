
public class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 2; // Error: This may cause unexpected results in output 
 } 
 } 
} 
// Error to investigate: What will be the output of this loop? How should 
//the loop variable be updated to achieve the desired result? 

//ANSWER
//i += 2; // Error: This may cause unexpected results in output and will give
//increment by 2 so we will get output in difference of 2.

//CORRECTED CODE
public class CorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i++; 
        } 
    } 
}