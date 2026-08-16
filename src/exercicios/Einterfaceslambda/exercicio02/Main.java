package exercicios.Einterfaceslambda.exercicio02;

public class Main {
    public static void main(String[] args) {
    Produto prod1 = new Produto("Arroz", 20, 1);
    Produto prod2 = new Produto("Consulta", 550, 2);
    Produto prod3 = new Produto("Camisa", 95, 3);
    Produto prod4 = new Produto("Apresentacao Cultural", 200, 4);
    Produto prod5 = new Produto("Computador", 3500, 5);
    
    prod1.exibirInfo();
    prod2.exibirInfo();
    prod3.exibirInfo();
    prod4.exibirInfo();
    prod5.exibirInfo();
    }
}