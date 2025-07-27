import java.util.*;
class Hello{
    public static void main(String[] args) {
        // for(int i=0;i<=4;i++){
        // System.out.println("Hello World");
        // }

        int n;
        System.out.println("Enter the number of time u want to print hello world");
        Scanner sc = new Scanner(System.in);

           n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     System.out.println("Hello World");
        // }
        int i=1;
        while(i<=n){
            System.out.println("Hello world");
            i++;
        }


    }
}