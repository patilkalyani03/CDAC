 public class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
} 
//compilation error: The methods which we write outside the static main method
//are non-static method and we cannot take referenced from non-static to static.
//error: non-static method display() cannot be referenced from a static context
//display();
 ^
//error: non-static method display(int) cannot be referenced from a static context
//display(5);
 ^