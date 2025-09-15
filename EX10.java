
import java.util.Scanner;

public class EX10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos = sc.nextInt(), meses = sc.nextInt(), dias = sc.nextInt();
        System.out.println("total em dias: " + (anos * 365 + meses * 30 + dias));
    }
}
