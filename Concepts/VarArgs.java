import java.util.Arrays;
// use of varargs when we dont know how many inputs we recive how many int we are passing 
public class VarArgs{
    public static void main(String[] args) {
        fun2(1,2,3,4,4,5,5,44,33);
    }
static void fun2(int... v){
System.out.println(Arrays.toString(v));
}

}
