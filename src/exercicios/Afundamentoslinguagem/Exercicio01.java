package exercicios.Afundamentoslinguagem;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        int ano = date.getYear();

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o seu ano de nascimento: ");
        int ano_nasc = ano - entrada.nextInt();

        System.out.println("Ola " + nome + " voce tem " + ano_nasc + " anos");
        entrada.close();
    }
}
