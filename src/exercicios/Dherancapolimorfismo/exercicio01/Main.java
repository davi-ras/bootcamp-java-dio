package exercicios.Dherancapolimorfismo.exercicio01;

public class Main {
    public static void main(String[] args) {

        // INGRESSO
        Ingresso ingressoNormal = new Ingresso("Inception", 50, false);
        System.out.println("--- INGRESSO NORMAL ---");
        System.out.println("Filme: " + ingressoNormal.getNomeFilme());
        System.out.println("Dublado: " + ingressoNormal.isDublado());
        System.out.println("Valor: R$ " + ingressoNormal.getValorReal());
        System.out.println();

        // MEIA ENTRADA
        MeiaEntrada meiaEntrada = new MeiaEntrada("Inception", 50, false);
        System.out.println("--- MEIA ENTRADA ---");
        System.out.println("Filme: " + meiaEntrada.getNomeFilme());
        System.out.println("Dublado: " + meiaEntrada.isDublado());
        System.out.println("Valor: R$ " + meiaEntrada.getValorReal());
        System.out.println();

        // INGRESSO FAMÍLIA (Até 3 pessoas)
        IngressoFamilia familia3Pessoas = new IngressoFamilia("Shrek", 50, true, 3);
        System.out.println("--- INGRESSO FAMÍLIA (3 PESSOAS) ---");
        System.out.println("Filme: " + familia3Pessoas.getNomeFilme());
        System.out.println("Dublado: " + familia3Pessoas.isDublado());
        System.out.println("Valor: R$ " + familia3Pessoas.getValorReal());
        System.out.println();

        // INGRESSO FAMÍLIA (Mais de 3 pessoas)
        IngressoFamilia familia4Pessoas = new IngressoFamilia("Shrek", 50, true, 4);
        System.out.println("--- INGRESSO FAMÍLIA (4 PESSOAS) ---");
        System.out.println("Filme: " + familia4Pessoas.getNomeFilme());
        System.out.println("Dublado: " + familia4Pessoas.isDublado());
        System.out.println("Valor: R$ " + familia4Pessoas.getValorReal());
    }
}