package exercicios.Einterfaceslambda.exercicio02v2;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;
    private Imposto regraImposto;

    public Produto(String nome, double preco, String categoria, Imposto regraImposto) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.regraImposto = regraImposto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValorImposto() {
        return this.regraImposto.calcularImposto(this.preco);
    }

    public void exibirInfo() {
        System.out.println("\n==================");
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Tributos: R$ " + getValorImposto());
    }
}