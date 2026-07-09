package exercicios.Afundamentoslinguagem;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = entrada.nextDouble();

        double area = (lado * lado);
        System.out.println("A área do quadrado de lado " + lado + " m, é " + area + " m²");

        entrada.close();
    }
}
