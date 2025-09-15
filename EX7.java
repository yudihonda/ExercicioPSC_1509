
import java.util.Scanner;

public class EX7 {

    public static void main(String[] args) {
        final double PI = 3.1416, CUSTO_M2 = 100;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble(), h = sc.nextDouble();
        double area = 2 * PI * r * (r + h);
        System.out.println("Custo: R$ " + (area * CUSTO_M2));
    }
}
