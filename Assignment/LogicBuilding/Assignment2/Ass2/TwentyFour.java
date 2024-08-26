 public class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
} 


//It will print all level because we didn't use break statement.
//we should use break statement so after the complition we can break it and
//it will prevent from printing the next one.
 
