package exercicios.Dherancapolimorfismo.exercicio01;

public class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(String nomeFilme, double valor, boolean dublado, int numeroPessoas) {
        super(nomeFilme, valor, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValorReal() {
        if (numeroPessoas > 3) {
            return valor * numeroPessoas * 0.95;

        } else {
            return valor * numeroPessoas;
        }
    }
}
