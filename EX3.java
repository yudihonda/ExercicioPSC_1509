
import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cotacao = sc.nextDouble(), valorDolar = sc.nextDouble();
        System.out.println("valor em reais: R$ " + (cotacao * valorDolar));
    }
}
