import java.util.Arrays;
// in overloading we use the same function in multiple time but change the value of params 
public class Overloading {
    public static void main(String[] args) {
        fun(556); // Corrected method call
        fun("Tushar Sharma"); // Corrected method call
        fun("hello world");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
    static void fun(char nhi){
        System.out.println(nhi);
    }
    
}
