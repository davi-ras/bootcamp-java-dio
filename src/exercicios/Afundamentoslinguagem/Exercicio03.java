package exercicios.Afundamentoslinguagem;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho da base do retângulo: ");
        double base = entrada.nextDouble();


        System.out.print("Digite o tamanho da altura do retângulo: ");
        double altura = entrada.nextDouble();

        double area = (base * altura);
        System.out.println("\nA área do retângulo de base " + base + " m e altura " + altura + " m, é " + area + " m²");

        entrada.close();
    }
}
