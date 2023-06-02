//6. Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int numInformado = entrada.nextInt();

        if(numInformado%5==0 && numInformado%7==0){
            System.out.println("O "+numInformado+" é múltiplo de 5 e 7");
        } else if (numInformado%7==0){
            System.out.println("O "+numInformado+" é múltiplo de 7");
        } else if (numInformado%5==0){
            System.out.println("O "+numInformado+" é múltiplo de 5");
        } else {
            System.out.println("O "+numInformado+" não é múltiplo de 5 e 7.");
        }

    }
}
