
public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num > 0); 
 } 
} 
// Error to investigate: Why does this loop print unexpected numbers? What 
//adjustments are needed to print the numbers from 1 to 5?

//ANSWER
//the loop is decrementing num thts why it will print unexpected numbers and
//also the condition which will always true. 

//CORRECTED CODE
public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num <= 5); 
    } 
}
