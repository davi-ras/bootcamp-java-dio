package exercicios.Dherancapolimorfismo.exercicio02;

public class Atendente extends Funcionario {
    protected double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void receberPagamento(double valor) {
        this.valorEmCaixa += valor;
    }

    public void fecharCaixa() {
        System.out.println("Fechando o caixa...");
    }
}
