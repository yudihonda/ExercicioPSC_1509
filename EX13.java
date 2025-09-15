
import java.util.Scanner;

public class EX13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consumo = sc.nextDouble(), horas = sc.nextDouble(), kwh = sc.nextDouble();
        double energia = consumo * horas, custo = energia * kwh;
        System.out.println("Energia: " + energia + " kWh, Custo: R$ " + custo);
    }
}
