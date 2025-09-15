
import java.util.Scanner;

public class EX12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diaria = sc.nextDouble(), kmTaxa = sc.nextDouble();
        int dias = sc.nextInt(), km = sc.nextInt();
        double desc = diaria * 0.1 * dias, total = diaria * dias * 0.9 + km * kmTaxa;
        System.out.println("total: R$ " + total + ", desconto: R$ " + desc);
    }
}
