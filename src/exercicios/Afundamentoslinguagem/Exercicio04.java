package exercicios.Afundamentoslinguagem;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa 1: ");
        String nome1 = entrada.nextLine();

        System.out.print("Digite a idade da pessoa 1: ");
        int idade1 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("\nDigite o nome da pessoa 2: ");
        String nome2 = entrada.nextLine();


        System.out.print("Digite a idade da pessoa 2: ");
        int idade2 = entrada.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.println("\n" + nome1 + " tem " + idade1 + " anos e " + nome2 + " tem " + idade2 + " anos");
        System.out.println("a diferença de idade entre eles é de " + diferenca + " ano(s)");

        entrada.close();
    }
}
