
import java.util.Scanner;

public class EX11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        double renda = total * (0.1 * 1 + 0.5 * 5 + 0.3 * 10 + 0.1 * 20);
        System.out.println("renda total: R$ " + renda);
    }
}
