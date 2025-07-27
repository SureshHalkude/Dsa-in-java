public class Reverse_Array {
    public static void Reverse(int arr[]){
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){


            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};


        System.out.println("Before doing reverse:-" + arr);
        Reverse(arr);
        System.out.println("Reversed array is:-" + arr);
    }
    
}
