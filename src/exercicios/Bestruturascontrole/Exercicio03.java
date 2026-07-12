package exercicios.Bestruturascontrole;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numeroInicial = entrada.nextInt();

        System.out.print("Digite um numero inteiro maior que o primeiro: ");
        int numeroFinal =  entrada.nextInt();

        System.out.print("Deseja exibir o intervalo em numeros pares (0) ou impares (1)? ");
        int opcao = entrada.nextInt();


        if (opcao != 0 && opcao != 1) {
            System.out.println("Opcao incorreta. Escolha 0 para pares ou 1 para impares.");

        } else {
            for (int i = numeroFinal; i >= numeroInicial; i--) {
                if (opcao == 0 && i % 2 == 0) {
                    System.out.println(i);

                }

                if (opcao == 1 && i % 2 != 0) {
                    System.out.println(i);

                }
            }
        }

        entrada.close();
    }
}
