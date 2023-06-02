//2. Escreva um programa para inserir um elemento (posição específica) em uma lista

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> bebidas = new ArrayList<>();

        bebidas.add("Vodka");
        bebidas.add("Tequila");
        bebidas.add("Corote");
        bebidas.add("Gin");

        bebidas.add(2,"Leite");
        System.out.println(bebidas);
    }
}
