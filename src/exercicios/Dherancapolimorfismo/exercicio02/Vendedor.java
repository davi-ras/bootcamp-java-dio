package exercicios.Dherancapolimorfismo.exercicio02;

public class Vendedor extends Funcionario {
    protected int qtdVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void realizarVenda() {
        this.qtdVendas += 1;
    }

    public void consultarVendas() {
        System.out.println(qtdVendas + " vendas feitas.");
    }



}
