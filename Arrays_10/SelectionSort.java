import java.util.*;
public class SelectionSort {
    public static void Selection_Sort(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int minIndex=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];           
            arr[minIndex]=temp;
        }
        }        
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int arr[]={5,3,1,4,2};
            Selection_Sort(arr);

            System.out.println("Sorted array is:-");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] +" ");
            }


        }
    }

