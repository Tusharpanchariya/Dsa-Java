import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 72, 43, 4, 5, 56};

        System.out.println("Maximum value: " + max(arr));
    }

    // Assuming array is not empty
    static int max(int[] arr) {
        int maxVal = arr[0]; // Initialize max value with first element

        for (int i = 1; i < arr.length; i++) { // Start from index 1
            if (arr[i] > maxVal) { // Corrected condition
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
