
public class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 
// Error to investigate: Why does the variable 'x' cause a compilation error? 
//How does scope 


//ANSWER
//because we declare x in for loop,we need to declare the variable x outside 
//the for loop if we want to use it outside the loop. 

//CORRECTED CODE
public class LoopVariableScope { 
    public static void main(String[] args) { 
        int x = 0; 
        for (int i = 0; i < 5; i++) { 
            x = i * 2; 
        } 
        System.out.println(x); 
    } 
}