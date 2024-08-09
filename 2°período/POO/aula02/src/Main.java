import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor máximo para k: ");
        int n = input.nextInt();
        int k =2;

        for( k = 2 ; k < n - 2; k += 3);
        System.out.println(k);
    }
}