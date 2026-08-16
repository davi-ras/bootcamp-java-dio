package exercicios.Einterfaceslambda.exercicio03;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10);
        Retangulo retangulo = new Retangulo(10, 17);
        Circulo circulo = new Circulo(8);

        System.out.println("\n===========================");
        System.out.println("Lado do quadrado: " + quadrado.getLado() + "m");
        System.out.println("Area do quadrado: " + quadrado.calcularArea() + "m²");

        System.out.println("\n===========================");
        System.out.println("Base do retangulo: " + retangulo.getBase() + "m");
        System.out.println("Altura do retangulo: " + retangulo.getAltura() + "m");
        System.out.println("Area do retangulo: " + retangulo.calcularArea() + "m²");

        System.out.println("\n===========================");
        System.out.println("Raio do circulo: " + circulo.getRaio() + "m");
        System.out.println("Area do circulo: " + circulo.calcularArea() + "m²");
    }
}