import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class pbl01 {
    public static void main(String[] args) {
        checkList(createListRandom());
    }

    public static List<Integer> createListRandom(){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Digite o tamanho da lista: ");
        int x = input.nextInt();
        for(int i=0; i<x; i++) {
            list.add(rand.nextInt(0, 100));
        }
            return list;

    }

    public static void checkList(List<Integer> list){
        System.out.println("------Resultado------");
        for ( int i:list) {
            if(i % 3 == 0){
                System.out.println(i + " - É múltiplo de 3");
            }
            else if(i % 2 == 0){
                System.out.println(i + " - É par");
            }
            else {
                System.out.println(i + " - É ímpar");
            }
        }
    }
}
