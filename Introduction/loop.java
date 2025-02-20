import java.util.*;

public class Main {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
// for loop 
for(int num=1; num<=n; num++){
  
  System.out.println(num + " " );
}

}
}

// output of this using for loop thats use for when you know how many times loop  going to run 
// 1 
// 2 
// 3 
// 4 
// 5 
// 6 
// 7 
// 8 
// 9 
// 10 


// While loop  use for when you dont know how many times loop  going to run 
int num = 1;
while (num <=5){
    System.out.println(num);
    num +=2;

}
// Output:

// 1
// 3
// 5

// do while loop  when loop atleast once 
do{
  System.out.println("Hello world");
}while(n !=2);


