import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*driving();
       triangle();
       weight();*/
       balance();
    }

    public static void driving(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int age = input.nextInt();

        if(age >= 18) {
            System.out.println("Você é apto a carteira de motorista");
        }
        else {
            System.out.println("Você ainda não pode dirigir");
        }
    }

    public static void triangle () {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do lado 1: ");
        float side1 = input.nextFloat();
        System.out.print("Digite o valor do lado 2: ");
        float side2 = input.nextFloat();
        System.out.print("Digite o valor do lado 3: ");
        float side3 = input.nextFloat();

        if((side1 + side2) >= side3 && (side2 + side3) >= side1 && (side3 + side1) >= side2) {
            if(side1 != side2 && side2 != side3 && side1 != side3){
                System.out.println("É um triangulo Escaleno");
            }
            else if(side1 == side2 && side2 == side3){
                System.out.println("É um triangulo Equilátero");
            }
            else {
                System.out.println("É um triangulo Isóceles");
            }
        }
        else{
            System.out.println("Não é um triangulo");
        }
    }
    public static void weight() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu peso");
        float weight = input.nextFloat();

        if(weight < 50) {
            System.out.println("Pertence a categoria palha");
        }
        else if(weight >= 50 && weight < 60){
            System.out.println("Pertence a categoria pluma");
        }
        else if (weight >= 60 && weight < 76) {
            System.out.println("Pertence a categoria leve");
        }
        else if (weight >= 76 && weight < 88) {
            System.out.println("Pertence a categoria pesado");
        }
        else if (weight >= 88) {
            System.out.println("Pertence a categoria super pesado");
        }
    }
    public static void balance(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu saldo: ");
        double balance = input.nextDouble();

        if (balance >= 0) {
            System.out.println("Saldo positivo: " + balance);
        }
        else{
            System.out.println("Saldo negativo: " + balance);
        }
    }
}




