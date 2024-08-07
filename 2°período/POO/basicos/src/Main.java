import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*truck();
        car();
        cinema();
        time();*/
        paint();
    }
    public static void truck() {
        int capacityTruckBox = 50;
        int capacityBox = 20;
        double weightBook = 0.100;
        int capacityTruckBook = capacityTruckBox * capacityBox;
        double weightTruck = capacityTruckBook * weightBook;
        System.out.println("Podem ser transportados " + capacityTruckBook + " livros");
        System.out.println("O peso do caminhão na sua capacidade total é " + weightTruck + "Kg");
    }
    public static void car(){
        Scanner input = new Scanner(System.in);
        int rentalPrice = 100;
        System.out.println("Quantos dias pretende ficar com o carro?");
        int rentalDays = input.nextInt();
        int price = rentalPrice * rentalDays;
        System.out.println("O preço fica R$"+price +",00");
    }
    public static void cinema(){
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos ingressos vai querer?");
        float ticket = input.nextFloat();
        int ticketPrice = 20;
        System.out.println("Qual é a sua porcentagem de desconto?");
        float discount = input.nextFloat();
        System.out.println("Qual o valor do estacionamento?");
        float parkingTicketPrice = input.nextFloat();

        float endPrice = ticketPrice * ticket;
        endPrice = (endPrice - (discount/100) * endPrice) - parkingTicketPrice;
        System.out.println("O preço a pagar é R$" + endPrice);
    }
    public static void time(){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a hora de entrada?");
        int entryHour = input.nextInt();
        System.out.println("Qual o minuto de entrada?");
        int entryMinute = input.nextInt();
        System.out.println("Qual a hora de saída?");
        int exitHour = input.nextInt();
        System.out.println("Qual o minuto de saída?");
        int exitMinute = input.nextInt();

        int minutesTimeEntry = entryHour * 60 + entryMinute;
        int minutesTimeExit = exitHour * 60 + exitMinute;
        int timePassed = minutesTimeExit - minutesTimeEntry;
        System.out.println("Minutos transcorridos: " + timePassed);
    }
    public static void paint(){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a altura do cilindro?");
        int height = input.nextInt();
        System.out.println("Qual o raio do cilindro?");
        int radius = input.nextInt();
        double area = (2 * 3.14 * radius * radius) + (2 * 3.14 * radius * height);
        double liter = area / 3;
        double canPaint = liter / 5;
        double price = canPaint * 50;
        System.out.println("Será necessário " + canPaint + " latas e o custo será R$" + price);
    }
}