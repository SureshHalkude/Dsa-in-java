import java.util.*;
public class Bubble_sort {
    public static void Bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the size of the array:-");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements in ths arrau:-");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Bubblesort(arr);

        System.out.println("After doing bubble sort:-");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");

    }

}
}