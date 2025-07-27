import java.util.*;
public class Maxmimum {
    public static void main (String args[]){
       System.out.println("Enter the size of the array:-");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

         System.out.println("Enter the elements in the array:-");
        for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
              
            }
          
        }
          System.out.println("The max array is:-" +max);


    }
}
