import java.util.Arrays;
import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

String[] str = new String[10];
for(int i = 0; i< str.length; i++){
    str[i] = in.next();
}
System.out.println(Arrays.toString(str));
str[1] = "Tushar";
System.out.println(Arrays.toString(str));

    }
    }
