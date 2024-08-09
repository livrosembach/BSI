import java.util.Scanner;
import java.lang.Math;

public class pbl2 {
    public static void trapezoid(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de a:");
        double a = input.nextDouble();
        System.out.println("Digite o valor de b:");
        double b = input.nextDouble();

        if(a <= b){
            System.out.println("Digite o valor de n:");
            double n = input.nextDouble();
            if(n > 0){
                double totalArea = 0;
                double x = 0;
                double h = (b - a) / n;
                double y1 = f(x);
                int i = 0;
                while(i < n){
                    x += h;
                    double y2 = f(x);
                    double trapezoidArea = ((y1 + y2) / 2) * h;
                    y1 = y2;
                    i++;
                }
                System.out.println(totalArea);
            }
            else
                System.out.println("O n tem que ser positivo");
        }
        else
            System.out.println("O valor de a deve ser menor ou igual ao b");
    }
    public static double f( double x){
        return 2*Math.sin(x) + Math.cos(x) / 3;
    }
}
