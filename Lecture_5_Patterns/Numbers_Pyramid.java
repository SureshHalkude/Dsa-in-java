public class Numbers_Pyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces for pyramid shape
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  
            }

            // Print numbers (repeat row number i times)
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();  
        }
    }
}
