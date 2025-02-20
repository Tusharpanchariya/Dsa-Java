// in switch statements you can jump various statement based on your expression
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String fruit = in.next();
    
switch (fruit){
  case "mango"-> System.out.println("king ");
  case "Apple"-> System.out.println("red ");
  case "grapes"-> System.out.println("green ");
  case "orange"-> System.out.println("orange ");
  case "chiku"-> System.out.println("small ");
}
     


      
    }
} 
// when we input the value from case its print only case output 