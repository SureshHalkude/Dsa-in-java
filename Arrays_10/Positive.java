/*Count Positive and Negative Numbers

Problem: Count how many positive and negative integers are in the array. using function

Example:
Input: [1, -3, 4, -2, 0] → Output: Positive = 2, Negative = 2 */

public class Positive {
    public static void countPositiveNegative(int arr[]){
        int positive=0;
        int negative=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }

        }
        System.out.println("Positive:-"+ positive);
        System.out.println("Negative:-" + negative);
       
        
    }

    public static void main(String args[]){
        int arr[]={1, -3, 4, -2, 0};
        countPositiveNegative(arr);


    }
    
}
