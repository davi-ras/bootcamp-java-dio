package exercicios.Einterfaceslambda.exercicio03;

public class Retangulo implements CalculoArea{
    private double base;
    private double altura;
    
    public Retangulo(double baseRetangulo, double alturaRetangulo) {
        this.base = baseRetangulo;
        this.altura = alturaRetangulo;

    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
