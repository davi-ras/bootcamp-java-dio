package exercicios.Cclassesencapsulamento.exercicio02;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Carro carro = new Carro();

        int opcao;

        do {
            System.out.println("\n\n ------ SIMULADOR DE CARRO ------");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda/direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar marcha");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligarCarro();
                    break;

                case 2:
                    carro.desligarCarro();
                    break;

                case 3:
                    carro.acelerarCarro();
                    break;

                case 4:
                    carro.diminuirVelocidade();
                    break;

                case 5:
                    carro.virarEsquerdaDireita();
                    break;

                case 6:
                    carro.verificarVelocidade();
                    break;

                case 7:
                    System.out.print("\nDigite qual marcha quer trocar (0 a 6): ");
                    int novaMarcha = entrada.nextInt();
                    carro.trocarMarcha(novaMarcha);
                    break;

                case 8:
                    System.out.println("\nEncerrando...");
                    break;

                default:
                    System.out.println("\nOpcao invalida! Tente novamente.");
            }

        } while (opcao != 8);

        entrada.close();

    }
}
