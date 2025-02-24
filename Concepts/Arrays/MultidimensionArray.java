import java.util.Scanner;  // Import Scanner class

public class MultidimensionArray {  // Removed parentheses
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[][] = new int[3][3];

        System.out.println("Array length: " + arr.length);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " "); // Use print instead of println
            }
            System.out.println(); // Print a new line after each row
        }

        in.close(); // Close the scanner to prevent resource leak
    }
}
