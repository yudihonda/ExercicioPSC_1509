
import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos = sc.nextInt();
        System.out.println("Batimentos: " + (anos * 365 * 24 * 60 * 60));
    }
}
