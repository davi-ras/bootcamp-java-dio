package exercicios.Cclassesencapsulamento.exercicio01;

import java.util.Scanner;

public class ContaTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("------ Caixa Eletronico ------\n");

        System.out.print("Digite o valor do deposito inicial para a abertura da conta: R$ ");
        double valorDepositoInicial = entrada.nextDouble();

        Conta conta = new Conta(valorDepositoInicial);
        System.out.println("\nConta criada com sucesso!");


        int opcao;

        do {
            System.out.println("\n\n ------ MENU DE OPERACOES ------");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar se conta esta no Cheque Especial");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nSaldo atual: " + conta.getSaldo());
                    break;

                case 2:
                    System.out.println("\nHá R$ " + conta.getLimiteChequeEspecial() + " de limite no Cheque Especial" );
                    break;

                case 3:
                    System.out.print("\nDigite quantos reais deseja depositar: R$ ");
                    double valorDeposito = entrada.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 4:
                    System.out.print("\nDigite quantos reais deseja sacar: R$ ");
                    double valorSaque = entrada.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 5:
                    System.out.print("\nDigite o valor do boleto a ser pago: R$ ");
                    double valorBoleto = entrada.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;

                case 6:
                    if (conta.isUsingChequeEspecial()) {
                        System.out.println("\nAtencao: Voce esta utilizando o Cheque Especial.");
                        System.out.println("R$ " + conta.getUsoChequeEspecial() + " usados.");
                    } else {
                        System.out.println("\nSua conta esta operando com saldo proprio.");

                    }
                    break;

                case 7:
                    System.out.println("\nEncerrando Sistema...");
                    break;

                default:
                    System.out.println("\nOpcao invalida! Tente novamente.");
            }

        } while (opcao != 7);

        entrada.close();

    }
}
