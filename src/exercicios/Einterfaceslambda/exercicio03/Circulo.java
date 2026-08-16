package exercicios.Einterfaceslambda.exercicio03;

public class Circulo implements CalculoArea{
    private double raio;

    public Circulo(double raioCirculo) {
        this.raio = raioCirculo;

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14159 * (raio * raio);
    }
}
