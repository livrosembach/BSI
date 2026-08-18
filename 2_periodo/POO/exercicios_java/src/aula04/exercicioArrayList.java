package aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicioArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Maria");
        names.add("João");
        names.add("Pedro");
        names.add("Sandra");
        names.add("Miguel");

        String option = "";

        while (!option.equals("9")) {
            System.out.println("******* Menu ******* \n 1- Não ordenado \n 2- Ordenado \n 9- Sair \n Opção: ");
            option = input.nextLine();
            switch (option) {
                case "1":
                    for (String name : names) {
                        System.out.println(name);
                    }
                    break;
                case "2":
                    ArrayList <String> namesSort = new ArrayList<String>(names);
                    Collections.sort(namesSort);
                    for (String nameSort : namesSort) {
                        System.out.println(nameSort);
                    }
                    break;
                case "9":
                    System.out.println("Você saiu com sucesso!");
                    break;
                default:
                    System.out.println("Porfavor digite um número válido");
            }
        }
    }
}
