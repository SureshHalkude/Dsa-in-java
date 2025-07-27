
/*Maximum and Minimum Element

Problem: Given an array of n integers, write a program to find the maximum and minimum element in it.

Example:
Input: [2, 8, 1, 4, 6] → Output: Max = 8, Min = 1*/


public class Max_Min {
    public static void main(String[] args) {
     int arr[]={2,8,0,4,6};

     int max=arr[0];
     int min=arr[0];

     for(int i=0;i<arr.length;i++){
        if(arr[i]> max){
            max=arr[i];
        }

     }
     System.out.println("The maximum is:-" + max);
     System.out.println(" ");

     for(int i=arr.length-1;i>=0;i--){
        if(arr[i]<min){
            min=arr[i];
        }
     }
     System.out.println("The minimum number is:-" + min);
        
    }
}
