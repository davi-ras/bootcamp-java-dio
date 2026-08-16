package exercicios.Einterfaceslambda.exercicio02v2;

public class Main {
    public static void main(String[] args) {
        Imposto impostoAlimentacao = preco -> preco * 0.01;
        Imposto impostoSaude       = preco -> preco * 0.015;
        Imposto impostoVestuario   = preco -> preco * 0.025;
        Imposto impostoCultura     = preco -> preco * 0.04;
        Imposto isentoOuPadrao     = preco -> 0.0;

        Produto prod1 = new Produto("Arroz", 20.0, "Alimentação", impostoAlimentacao);
        Produto prod2 = new Produto("Consulta", 550.0, "Saúde e bem estar", impostoSaude);
        Produto prod3 = new Produto("Camisa", 95.0, "Vestuário", impostoVestuario);
        Produto prod4 = new Produto("Apresentação Cultural", 200.0, "Cultura", impostoCultura);
        Produto prod5 = new Produto("Computador", 3500.0, "Informática", isentoOuPadrao);

        prod1.exibirInfo();
        prod2.exibirInfo();
        prod3.exibirInfo();
        prod4.exibirInfo();
        prod5.exibirInfo();
    }
}