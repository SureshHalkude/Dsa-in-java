import java.util.*;
public class Sum {
    public static void sum(int a, int b){
        int result = a*b;
        System.out.println("The sum of two numbers is:-"+result);
    }

    public static void main(String[] args) {
        System.out.println("Enter the two numbers:-");
        Scanner sc=new Scanner(System.in);

       int a=sc.nextInt();
       int b=sc.nextInt();

       
       sum(a,b);
      }
    
}
