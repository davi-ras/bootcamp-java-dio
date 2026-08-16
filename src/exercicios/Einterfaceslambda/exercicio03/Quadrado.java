package exercicios.Einterfaceslambda.exercicio03;

public class Quadrado implements CalculoArea {
    private double lado;

    public Quadrado(double ladoQuadrado) {
        this.lado = ladoQuadrado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
