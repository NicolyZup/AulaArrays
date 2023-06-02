//12. Ler um vetor A com 20 elementos. Construir dois vetores
// B e C, sendo que nos vetor B e C serão armazenados o valores
// pares e ímpares de A, respectivamente.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio12 {
    public static void main(String[] args) {
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        List<Integer> vetorB = new ArrayList<>();
        List<Integer> vetorC = new ArrayList<>();

        for(int elemento : vetorA){
            if(elemento %2 ==0){
                vetorB.add(elemento);
            } else{
                vetorC.add(elemento);
            }
        }

        System.out.println(Arrays.toString(vetorA));
        System.out.println(vetorB);
        System.out.println(vetorC);

    }
}
