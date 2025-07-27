import java.util.*;
public class Matrix_Function {
    public static int[][] MatrixFunction(int a[][],int b[][]){
      int [][] sum= new int[4][4];

      for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
              sum[i][j]=a[i][j]+b[i][j];
          }
      }
        
      return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int m1[][]=new int[4][4];
        int m2[][]=new int[4][4];

        System.out.println("Enter the first matrix:-");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                m1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix:-");
        for(int i=0;i<4;i++){
            
            for(int j=0;j<4;j++){
                m2[i][j]=sc.nextInt();
            }
        }

        int sum[][]=MatrixFunction(m1,m2);

        System.out.println("Sum of the two matrix is:-");
        for(int i=0;i<4;i++){
            
            for(int j=0;j<4;j++){
                System.out.print(sum[i][j]+" ");
        }

        System.out.println();
        

    }
}
}
