import java.util.*;

public class Q1 {
    
    public static float Average(float a, float b, float c) {
        float avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("Enter the three numbers: ");
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float result = Average(a, b, c);
        System.out.println("The average of the three numbers is: " + result);
    }
}
