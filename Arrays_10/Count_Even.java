class Count_Even {
    public static void main(String[] args) {
        int arr[]={2,5,7,8,10,11};

        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("The total number of even is:-" + evencount);
        System.out.println("The total number of odd is:-" + oddcount);
    }
    
}
