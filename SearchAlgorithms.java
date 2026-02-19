import java.util.Scanner;
import java.util.Arrays;
// STEP 1: Define the Search Methods (The Blueprint
public class SearchAlgorithms {
    // A. LINEAR SEARCH
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            // Check if current element matches the target
            if (arr[i] == target) {
                return i;   // Return 'i' if found
            }
        }
        return -1; // Element not found
    }
    // B. SIMPLE BINARY SEARCH (Iterative)
    static int binarySearchSimple(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            // Condition 1: Target found at mid
            if (arr[mid] == target) {
                return mid;
            }
            // Condition 2: Target is larger, look in right half
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            // Condition 3: Target is smaller, look in left half
            else {
                high = mid - 1;
            }
        }
        return -1; // Not found
    }
    // C. RECURSIVE BINARY SEARCH
    static int binarySearchRecursive(int[] arr, int low, int high, int target) {
        // Base Case
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        // Condition 1: Target found
        if (arr[mid] == target) {
            return mid;
        }
        // Condition 2: Target is larger
        else if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, high, target);
        }
        // Condition 3: Target is smaller
        else {
            return binarySearchRecursive(arr, low, mid - 1, target);
        }
    }
    // STEP 2: Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input Section
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int target = sc.nextInt();
        // Linear Search
        System.out.println("\n--- Linear Search Result ---");
        int lResult = linearSearch(arr, target);
        if (lResult != -1)
            System.out.println("Element found at index: " + lResult);
        else
            System.out.println("Not Found");
        // Prepare for Binary Search
        Arrays.sort(arr);
        System.out.println("\n(Array has been sorted for Binary Search)");
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        // Simple Binary Search
        System.out.println("\n--- Simple Binary Search Result ---");
        int bResult = binarySearchSimple(arr, target);
        if (bResult != -1)
            System.out.println("Element found at index: " + bResult);
        else

            System.out.println("Not Found");
        // Recursive Binary Search
        System.out.println("\n--- Recursive Binary Search Result ---");
        int rResult = binarySearchRecursive(arr, 0, n - 1, target);
        if (rResult != -1)
            System.out.println("Element found at index: " + rResult);
        else
            System.out.println("Not Found");
        sc.close();
    }
}


