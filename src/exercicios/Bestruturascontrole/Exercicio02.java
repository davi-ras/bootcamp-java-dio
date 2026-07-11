package exercicios.Bestruturascontrole;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu peso em quilos: ");
        float peso = entrada.nextFloat();
        entrada.nextLine();

        System.out.print("Digite a sua altura em metros: ");
        float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");

        } else if (imc >= 18.6 && imc <= 24.9 ) {
            System.out.println("Peso ideal");

        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");

        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
            
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");

        } else {
            System.out.println("Obesidade Grau III (Mórbida)");

        }
    }
}
