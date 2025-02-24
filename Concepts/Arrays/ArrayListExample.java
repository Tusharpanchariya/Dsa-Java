import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {  // Avoid naming conflicts with java.util.ArrayList
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner initialized

        ArrayList<Integer> list = new ArrayList<>(5); // Correct initialization

        // Adding elements to the list
        list.add(45);
        list.add(78);
        list.add(15);
        list.add(45);
        list.add(78);
        list.add(15);
        list.add(45);
        list.add(78);
        list.add(15);
        list.add(45);
        list.add(78);
        list.add(15);

        System.out.println("Original List: " + list);

        list.set(0, 99); // Correctly update index 0 with 99
        list.remove(2);  // Correctly remove element at index 2

        System.out.println("Updated List: " + list);

        in.close(); // Closing Scanner
    }
}
