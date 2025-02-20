// in switch statements you can jump various statement based on your expression
import java.util.Scanner;

public class Scope{
    public static void main(String[] args) {
 // note anything initilize outside the block that use in inside the block but that is initize the onside the vlog that not initlize the outside the block z
   
int a = 10;
int b = 30;  // in function not add same  refrence variable  in one function like i will not decalre any variable that have int a=2;
String name = "abhishek" ;
{
// int a = 10; already intilize the in the same block with same variable 
 a = 99;  // reasign the bvariable with another value //
 System.out.println(a);
int c = 8 ; 
name = "TUSHAR";
// System.out.println(name);
// value intilize in this block willl remain in this block 
}
System.out.println(name);
// System.out.println(c); //cannot use outside the block 
// scoping in for loop 
for(int i = ){
}
    }

    static void random(int marks){
        int num = 2;
        System.out.println(num);
        System.out.println(marks);
    }
} 
// when we input the value from case its print only case output 