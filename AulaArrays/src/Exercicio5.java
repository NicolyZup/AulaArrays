//5. Criar um programa que calcule a média de salários
// de uma empresa, pedindo ao usuário a grade de funcionários
// e os salários, e devolvendo a média salarial.

import java.util.*;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<String> funcionarios = new ArrayList<>();
        List<Double> salarios = new ArrayList<>();
        /*Map<String, Double> grade = new HashMap<>();*/

        System.out.println("Informe o número de funcionários:");
        int numFuncionarios = entrada.nextInt();

        double somaSalarios = 0;

        for(int i=1; i <= numFuncionarios; i++){
            System.out.println("Informe o nome do(a) " +i+"°/ª funcionário(a):");
            String nome = entrada.next();
            funcionarios.add(nome);

            System.out.println("Agora informe o salário do(a) funcionário(a):");
            Double salario = entrada.nextDouble();
            salarios.add(salario);
        }

        for(double i : salarios){
            somaSalarios +=i;
        }

        double media = somaSalarios/numFuncionarios;

        System.out.printf("A média salarial da empresa é R$%.2f",media);
    }
}
