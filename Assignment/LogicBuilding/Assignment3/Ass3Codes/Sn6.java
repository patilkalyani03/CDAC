
public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) 
            System.out.println(i); 
            System.out.println("Done"); 
    }         
} 
// Error to investigate: Why does "Done" print only once, outside the loop? 
//How should the loop body be enclosed to include all statements within 
//the loop? 

//ANSWER
// The Done statement is outside the loop because it is not in within the 
//loop body.the curly brace is not given.

//CORRECTED CODE
public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            System.out.println(i); 
            System.out.println("Done"); 
        } 
    } 
}

