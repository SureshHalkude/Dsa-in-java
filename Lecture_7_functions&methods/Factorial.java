import java.util.*;
public class Factorial {
    public static void FactorialCal(int n){
if(n<0){
    System.out.print("Invalid number");
}

        int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;

    }
    System.out.println(fact);
    return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the factorial number:-");
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
       System.out.print("The factorial of "+a +" is:-");      
  FactorialCal(a);
    }
}
