package exercicios.Fcollectionsclassesutilitarias.exercicio01;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("==== Calculadora ===");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.print("Digite qual operacao deseja realizar [1] ou [2]: ");
        var opcao = entrada.nextInt();
        entrada.nextLine();

        while (opcao != 1 && opcao != 2) {
            System.out.println("Opcao invalida! Escolha [1] ou [2]");
            opcao = entrada.nextInt();
            entrada.nextLine();
        }

        var operacaoSelecionada = Operacao.values()[opcao - 1];

        System.out.println("Informe os numeros que serao usados separados por virgula (ex: 1, 2, 3, 4): ");
        var numeros = entrada.nextLine();

        var arrayNumeros = Arrays.stream(numeros.split("\\s*,\\s*"))
                .mapToLong(Long::parseLong)
                .toArray();

        var resultado = operacaoSelecionada.getRetornoOperacao().calcular(arrayNumeros);
        var exibirOperacao = numeros.replaceAll("\\s*,\\s*", " " + operacaoSelecionada.getSinal() + " ");
        System.out.println("O resultado da operacao " + exibirOperacao + " e: " + resultado);

        entrada.close();
    }
}