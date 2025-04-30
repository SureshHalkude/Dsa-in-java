/*Find Numbers With Even Numbers Of Digits */
class Even_Number_Digits {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            int count=0;

            while(number !=0){
                count++;
                number /=10;
            }
            if(count %2==0){
                System.err.println(nums[i] + " ");
            }
        }

    }
}


