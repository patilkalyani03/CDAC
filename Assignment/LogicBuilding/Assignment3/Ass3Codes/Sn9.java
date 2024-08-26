
public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 2) { 
 System.out.println(i); 
 } 
 } 
} 
// Error to investigate: Why does the loop print unexpected results or run 
//infinitely? How should the loop update expression be corrected? 

//ANSWER
//it will print output after 2 step as we incrementing it like that .

//CORRECTED CODE
public class CorrectedForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            System.out.println(i); 
        } 
    } 
}