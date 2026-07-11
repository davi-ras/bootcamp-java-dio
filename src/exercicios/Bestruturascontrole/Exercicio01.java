package exercicios.Bestruturascontrole;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + "\t= " + (i * numero));
        }
    }
}
