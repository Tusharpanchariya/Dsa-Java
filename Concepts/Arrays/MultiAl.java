import java.util.ArrayList;
import java.util.Scanner;

public class MultiAl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Initialize Scanner
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Create 3 empty ArrayLists (for 3 rows)
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Taking input for the 2D ArrayList
        System.out.println("Enter 9 numbers:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt()); // Corrected input
            }
        }

        // Printing the 2D ArrayList
        System.out.println("2D ArrayList:");
        for (ArrayList<Integer> row : list) {
            System.out.println(row);
        }

        in.close(); // Close Scanner
    }
}
