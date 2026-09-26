package exercicios.Fcollectionsclassesutilitarias.exercicio01;

import java.util.stream.LongStream;

public enum Operacao {
    SOMA(n -> LongStream.of(n).reduce(0, Long::sum), "+"),

    SUBTRACAO(n -> LongStream.of(n).reduce((n1, n2) -> n1 - n2).orElse(0), "-");

    private final Calculadora retornoOperacao;

    private final String sinal;

    Operacao(Calculadora retornoOperacao, String sinal) {
        this.retornoOperacao = retornoOperacao;
        this.sinal = sinal;
    }

    public Calculadora getRetornoOperacao() {
        return retornoOperacao;
    }

    public String getSinal() {
        return sinal;
    }
}
