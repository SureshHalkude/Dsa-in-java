class Reverse_Array {
    public static void Reverse(int arr[]){
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};


        System.out.println("Before doing reverse:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        Reverse(arr);
        System.out.println("Reversed array is:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println(" ");
    }
    
}
