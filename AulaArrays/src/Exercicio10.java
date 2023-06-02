//10. Criar um vetor A com 10 elementos inteiros.
// Implementar um programa que defina e escreva a média
// aritmética simples dos elementos ímpares armazenados neste vetor.

import java.util.ArrayList;
import java.util.List;

public class Exercicio10 {
    public static void main(String[] args) {
        int[] elementos = {4,7,9,10,12,17,19,21,22,28};

        List<Integer> impares = new ArrayList<>();
        int soma =0;

        for(int num : elementos){
            if(num%2 != 0){
                impares.add(num);
            }
        }
        for(int impar :impares){
            soma+=impar;
        }

        int media = soma/impares.size();

        System.out.println(media);
        System.out.println(impares);
    }
}
