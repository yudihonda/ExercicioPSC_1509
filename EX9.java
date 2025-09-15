
import java.util.Scanner;

public class EX9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        double peso = 0;
        for (int i = 0; i < 3; i++) {
            sc.next();
            idade += sc.nextInt();
            peso += sc.nextDouble();
        }
        System.out.println("idade média: " + (idade / 3.0));
        System.out.println("peso médio: " + (peso / 3));
    }
}
