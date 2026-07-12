package exercicios.Bestruturascontrole;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numeroInicial = entrada.nextInt();

        while (true) {
            System.out.print("Digite outro numero inteiro");
            int numero = entrada.nextInt();

            if (numero < numeroInicial) {
                continue;
            }

            if (numero % numeroInicial != 0) {
                break;
            }
        }

        entrada.close();
    }
}
