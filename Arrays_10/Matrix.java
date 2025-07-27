import java.util.*;
class Matrix{
    public static void main (String args[]){
        
    //     Scanner sc=new Scanner(System.in);
    //   int row[][]=new int[4][4];
    //   int cols[][]=new int[4][4];
    //   int sum[][]=new int[4][4];


    //   System.out.println("Enter the first 4 * 4 matrix:-");
    //     for(int i = 0; i <4 ; i++){
    //         for(int j=0;j<4;j++){
    //             row[i][j]=sc.nextInt();
    //         }   
    //     }
    //     System.out.println("Enter the second * 4 matrix:-");
    //     for(int i=0;i<4;i++){
    //         for(int j=0; j<4;j++){
    //             cols[i][j]=sc.nextInt();
    //         }
    //     }

    //     for(int i=0;i<4;i++){
    //         for(int j=0;j<4;j++){
    //             sum[i][j]=row[i][j]+cols[i][j];
    //         }
    //     }
    //     System.out.println("The sum of two matrix is:-");
    //     for(int i=0;i<4;i++){
    //         for(int j=0;j<4;j++){
    //             System.out.print(sum[i][j]+" ");
    //         }
    //         System.out.println();
    //     }

    //Multplication Matrix
    Scanner sc=new Scanner(System.in);
    int rows[][]=new int[4][4];
    int cols[][]=new int [4][4];
    int mul[][]=new int[4][4];

    System.out.println("Enter the first matrix:-");
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            rows[i][j]=sc.nextInt();

        }
    }

    System.out.println("Enter the second matrix:-");
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
        cols[i][j]=sc.nextInt();
    }
    }


    System.out.println("After mulplication the matrix is:-");
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            for(int k=0;k<4;k++){
                mul[i][j]+=rows[i][k]*cols[k][j];
            }
            System.out.print(mul[i][j]+" ");
        }
        System.out.println();
    }


    }

}