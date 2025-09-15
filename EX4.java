
import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double horas = sc.nextDouble(), valorHora = sc.nextDouble();
        double bruto = horas * valorHora, liquido = bruto * 0.94;
        System.out.println("Salário: R$ " + liquido);
    }
}
