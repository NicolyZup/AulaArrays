//7. Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quantos números serão informados:");
        int contador = entrada.nextInt();

        List<Integer> numInformados = new ArrayList<>();

        for (int i = 1; i <= contador; i++){
            System.out.println("Informe o "+i+"º número:");
            int numero = entrada.nextInt();
            numInformados.add(numero);
        }

        List<Integer> novaLista = new ArrayList<>();

        for (int i = contador-1;i>=0;i--){
            novaLista.add(numInformados.get(i));
        }

        System.out.println(numInformados);
        System.out.println(novaLista);

    }
}
