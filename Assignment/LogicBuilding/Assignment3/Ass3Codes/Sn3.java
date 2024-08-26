
public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num > 0); 
 } 
} 
// Error to investigate: Why does the loop only execute once? What is wrong 
//with the loop condition in the `do while` loop? 

//ANSWER
//the loop in code will excute once because of condition num > 0, thats 
//why it will run indefinitely.

//CORRECTED CODE
public class DoWhileCorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 5); 
    } 
}

