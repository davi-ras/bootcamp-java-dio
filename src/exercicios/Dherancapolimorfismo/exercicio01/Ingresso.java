package exercicios.Dherancapolimorfismo.exercicio01;

public class Ingresso {
    protected String nomeFilme;
    protected double valor;
    protected boolean isDublado;

    public Ingresso(String nomeFilme, double valor, boolean isDublado) {
        this.nomeFilme = nomeFilme;
        this.valor = valor;
        this.isDublado = isDublado;

    }

    public double getValorReal() {
        return valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isDublado() {
        return isDublado;
    }
}
