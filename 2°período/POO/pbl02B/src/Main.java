import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Digite o número do primeiro termo da PA:");
        double a_1 = input.nextDouble();
        System.out.println("Digite a razão da PA:");
        double r = input.nextDouble();
        System.out.println("Digite o número de termos da PA:");
        int n = input.nextInt();
        while(n < 0){
            System.out.println("O número de termos tem que ser positivo. Digite novamente:");
            n = input.nextInt();
        }
        double a_n = a_1 + (n - 1) * r;;
        System.out.println("O último termo da PA é: " + a_n);
        double s_n = (a_1 + a_n) * n / 2;
        System.out.println("A soma dos termos da PA é: " + s_n);
    }
}