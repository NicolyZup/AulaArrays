//4. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
// de 10 pessoas. Fazer um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.

import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Double> altura = new ArrayList<>();
        List<String> sexo = new ArrayList<>();

        double somaAlturas = 0;
        int homens =0;
        double maiorAltura =0;
        int mulheres = 0;

        for(int i = 1; i<=10; i++){
            System.out.println("Informe a altura da "+i+"ª pessoa:");
            double alturaInformada = entrada.nextDouble();
            altura.add(alturaInformada);

            System.out.println("Agora informe o sexo da "+i+"ª pessoa: masculino/feminino");
            String sexoInformado = entrada.next();
            sexo.add(sexoInformado);

            if(alturaInformada > maiorAltura){
                maiorAltura = alturaInformada;
            }

            if(sexoInformado.equals("masculino")){
                somaAlturas += alturaInformada;
                homens +=1;
            } else {
                mulheres +=1;
            }
        }

        double menorAltura = altura.get(0);
        for(double num : altura){
            if(num < menorAltura){
                menorAltura = num;
            };
        }
        double media = somaAlturas/homens;

        System.out.println("Maior altura: " + maiorAltura );
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média altura dos homens: " + media );
        System.out.println("Quantidade de mulheres: " + mulheres);

    }
}
