
import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {
        
        final double MILIMETRO_POL = 25.4;
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble(), polegadas = sc.nextDouble();
        System.out.println("celsius: " + ((5 * f - 160) / 9));
        System.out.println("milímetros: " + (polegadas * MILIMETRO_POL));
    }
}
