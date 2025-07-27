
/*Problem: Find the second largest number in the array without sorting it.

Example:
Input: [10, 5, 20, 8] → Output: Second Largest = 10 */
public class Second_Largest {
    public static void secondLargest(int arr[]){
        int Flargest=Integer.MIN_VALUE;
        int Slargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > Flargest){
                Slargest=Flargest;
                Flargest = arr[i];
            }else if(arr[i]>Slargest && arr[i]!=Flargest){
                Slargest=arr[i];
            }
        }
        System.out.println("Second largest:-" + Slargest);
    }

    public static void main(String args[]){
        int arr[]={10, 5, 20, 8};
        secondLargest(arr);
    }

    
}
