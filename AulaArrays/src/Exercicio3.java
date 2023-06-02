//3. Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes)

import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        System.out.println("Informe o 1º número:");
        int primeiroNum = entrada.nextInt();
        numeros.add(primeiroNum);

        System.out.println("Informe o 2º número:");
        int segundoNum = entrada.nextInt();
        numeros.add(segundoNum);

        for (int i = 0 ; i < 1; i++){
            if(numeros.get(i) < numeros.get(i+1)){
                // esse método troca 2 elementos de lugar
                Collections.swap(numeros,0, 1);
            }
        }

        //tem essa outra forma com a classe Colletions em java com o método que reverte a ordem crescente
        /*Collections.sort(numeros, Collections.reverseOrder());*/

        System.out.println(numeros);

    }
}
