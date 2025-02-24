import java.util.Arrays;
import java.util.Scanner;
// in passing in function we change the value of the arr nth number with decale a function and change the vaalue that show in below code 
public class Passingfunction{
    public static void main(String[] args) {
int[] nums = {1,4,5,3};
System.out.println(Arrays.toString(nums));
change(nums);
System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[3]= 99;

    }
    }
