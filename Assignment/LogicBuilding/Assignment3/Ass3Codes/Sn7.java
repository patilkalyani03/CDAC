
public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count; 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
       } 
   } 
} 
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
variable properly? 

//ANSWER
// we will gel compilation error.Because we have not initialized count we just
//declared it.

//CORRECTED CODE
public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}

