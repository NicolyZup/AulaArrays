//11. Ler um vetor A com 10 elementos inteiros correspondentes as
// idades de um grupo de pessoas. Escreva um programa que determine e
// escreva a menor e a maior idades e suas respectivas posições.

public class Exercicio11 {
    public static void main(String[] args) {
        int[] elementos = {8,22,15,45,18,2,25,9,32,35};

        int menorIdade = elementos[0];
        int maiorIdade = elementos[0];
        int indiceMenorIdade = 0;
        int indiceMaiorIdade = 0;

        for (int i =0 ; i < elementos.length;i++){
            if(elementos[i] < menorIdade){
                menorIdade = elementos[i];
                indiceMenorIdade =i+1;
            } else if (elementos[i] > maiorIdade) {
                maiorIdade = elementos[i];
                indiceMaiorIdade = i+1;
            }
        }

        System.out.printf("Menor idade da lista: "+menorIdade+" e sua posição: "+indiceMenorIdade+"º \r\n");
        System.out.printf("Maior idade da lista: "+maiorIdade+" e sua posição: "+indiceMaiorIdade+"º");
    }
}
