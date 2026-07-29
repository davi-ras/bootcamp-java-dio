package exercicios.Dherancapolimorfismo.exercicio01;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(String nomeFilme, double valor, boolean dublado) {
        super(nomeFilme, valor, dublado);

    }

    @Override
    public double getValorReal() {
        return valor / 2;
    }
}
