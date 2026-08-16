package exercicios.Einterfaceslambda.exercicio02;

public class Produto implements Imposto {

    private String nome;
    private double preco;
    private int tipo;

    public Produto(String nomeProduto, double precoProduto, int tipoProduto) {
        this.nome = nomeProduto;
        this.preco = precoProduto;
        this.tipo = tipoProduto;

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularImposto() {
        return switch (tipo) {
            case 1 -> preco * 0.01;   // Alimentação 
            case 2 -> preco * 0.015;   // Saúde e bem estar
            case 3 -> preco * 0.025;   // Vestuário 
            case 4 -> preco * 0.04;   // Cultura
            default ->  0;
                
        };
    }

    public void exibirInfo() {
        System.out.println("\n==================");
        System.out.println("Produto: " + getNome());
        System.out.println("Preco: R$ " + getPreco());
        System.out.println("Tributos: R$ " + calcularImposto());

        String categoria = switch (tipo) {
            case 1 -> "Alimentação";
            case 2 -> "Saúde e bem estar";
            case 3 -> "Vestuário";
            case 4 -> "Cultura";
            default -> "Categoria não definida! não foi possível calcular o imposto";
        };

        System.out.println("Categoria: " + categoria);
    }
}