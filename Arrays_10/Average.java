/*Problem Statement:
Write a Java program to calculate the sum and average of all the elements in a given array.

Example:

makefile
Copy
Edit
Input: [10, 20, 30, 40]  
Output: Sum = 100, Average = 25.0 */
public class Average {
    public static void main(String[] args) {
        int sum=0;
        int arr[]={10,20,30,40};
        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];
           

        }
        double average=(double) sum /arr.length;
         System.out.println("The sum of array is:-" + sum);
         System.out.println("The average of array is:-" + average);

         
    }
}
