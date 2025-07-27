
/*Problem: Write a program to search for a number in an array and print its index.

Example:
Input: [3, 6, 8, 1], Target = 8 → Output: Index = 2 */

public class Index {
    public static void main(String[] args) {

        int arr[] = { 3, 6, 8, 1 };
        int target = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("The number found at the index is:-" + i);
                return;
            }

        }
        System.out.println("NOt found");
    }

}

/*
 * USING METHOD
 * public class Index {
 * 
 * 
 * static int search(int arr[], int target) {
 * 
 * for (int i = 0; i < arr.length; i++) {
 * 
 * if (arr[i] == target) {
 * return i;
 * }
 * }
 * 
 * return -1;
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = {3, 6, 8, 1};
 * int target = 8;
 * 
 * int result = search(arr, target); // Call method
 * 
 * if (result >= 0) {
 * System.out.println("Found at index: " + result);
 * } else {
 * System.out.println("Not found");
 * }
 * }
 * }
 * 
 */
