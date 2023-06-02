//1. Escreva um programa para remover um elemento específico de uma lista.

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Nicoly");
        nomes.add("Mariana");
        nomes.add("Marcos");
        nomes.add("João");
        nomes.add("Henrique");

        nomes.remove("João");

        System.out.println(nomes);
    }
}
