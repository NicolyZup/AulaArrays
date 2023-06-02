//9. Crie um programa para exibir a soma de 20 números usando uma matriz

public class Exercicio9 {
    public static void main(String[] args) {
        int[][] matriz = new int[20][20];
        int soma = 0;


        for( int linha = 0; linha < matriz.length; linha++) {
            for( int coluna = 0; coluna < matriz[linha].length; coluna++) {

                matriz[linha][coluna] = linha * coluna;
            }
        }

        for( int linha = 0; linha < matriz.length; linha++) {
            for( int coluna = 0; coluna < matriz[linha].length; coluna++) {
                soma += matriz[linha][coluna];
            }
        }

        System.out.println(soma);
    }
}
