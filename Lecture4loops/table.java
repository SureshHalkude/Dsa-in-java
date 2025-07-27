import java.util.*;
public class table {
  public static void main(String[] args) {
      
    int n;
    System.out.print("Enter the number which u want the table:-");
    Scanner sc = new Scanner(System.in);

    n=sc.nextInt();
    for(int i=1;i<=10;i++){
        int sum = n*i;
    //   System.out.println(sum);

    System.out.println(n + "*" + i + "=" + sum); 
    }
  }  

}
