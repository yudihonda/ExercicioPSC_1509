
import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble(), reajuste = sc.nextDouble();
        System.out.println("novo salario: R$ " + (salario + salario * reajuste / 100));
    }
}
