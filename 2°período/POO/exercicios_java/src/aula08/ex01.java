package aula08;

import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {
        int[] numeros = {4,5,8,9,20,3,4,5};
        int[] div = {2,4,0,8,3,0};
        int i;

            for(i=0;i < numeros.length; i++) {
                try {
                    System.out.println(numeros[i] + " / " + div[i] + " = " + (numeros[i] / div[i]));
                } catch (ArithmeticException ae) {
                    System.out.println("Você tentou dividir por 0");
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Você tem mais números do que divisores");
                }

            }
    }
}
