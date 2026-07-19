package exercicios.Cclassesencapsulamento.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("------ Pet Shop ------");
        System.out.print("\nDigite o nome do pet: ");
        String nomePet = entrada.nextLine();

        MaquinaBanho maquina = new MaquinaBanho();
        Pet pet1 = new Pet(nomePet);

        int opcao;

        do {
            System.out.println("\n\n ------ MENU OPERACOES ------");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - verificar nivel de água");
            System.out.println("5 - verificar nivel de shampoo");
            System.out.println("6 - verificar se tem pet no banho");
            System.out.println("7 - colocar pet na maquina");
            System.out.println("8 - retirar pet da máquina");
            System.out.println("9 - limpar maquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    maquina.darBanhoPet();
                    break;

                case 2:
                    maquina.abastecerAgua();
                    break;

                case 3:
                    maquina.abastecerShampoo();
                    break;

                case 4:
                    maquina.verificarAgua();
                    break;

                case 5:
                    maquina.verificarShampoo();
                    break;

                case 6:
                    maquina.verificarUsoMaquina();
                    break;

                case 7:
                    maquina.colocarPetMaquina(pet1);
                    break;

                case 8:
                    maquina.retirarPetMaquina();
                    break;

                case 9:
                    maquina.limparMaquina();
                    break;

                case 0:
                    System.out.println("\nEncerrando...");
                    break;

                default:
                    System.out.println("\nOpcao invalida! Tente novamente.");
            }

        } while (opcao != 0);

        entrada.close();

    }
}
