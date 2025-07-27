import java.util.*;

public class Reverse {
    public static void main(String[] args) {

        // Input: [1, 2, 3, 4, 5]
        // Output: [5, 4, 3, 2, 1]

        // int arr[]={1,2,3,4,5};

        // System.out.println("Before reversing the array:-");
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println(" ");

        // System.out.println("After reversing the array is:-");
        // for(int i=arr.length-1;i>=0;i--){
        // System.out.print(arr[i] + " ");
        // }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:-");
        int size = sc.nextInt();
        int arr[] = new int[size];


        System.out.println("Enter the elements to do reverse:-");
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
        }

        System.out.println("AFter reversing the array is:-");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }

    }
}
