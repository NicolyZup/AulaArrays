//Crie um programa para exibir todos os inteiros dentro
// do intervalo 100-150 cuja soma de todos os dígitos é um número par.

public class Exercicio8 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 100;i<=150;i++){
            soma+=i;
            System.out.println(i);
        }

        System.out.println(soma);
    }
}
