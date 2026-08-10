package exercicios.Dherancapolimorfismo.exercicio03;

public class Main {
    public static void main(String[] args) {
        RelogioBR clockBR = new RelogioBR();
        RelogioUS clockUS = new RelogioUS();

        clockBR.setHora(22);
        clockBR.setMinuto(35);
        clockBR.setSegundo(14);

        clockUS.setAM(true);
        clockUS.setHora(11);
        clockUS.setMinuto(44);
        clockUS.setSegundo(7);


        System.out.println("relogio padrao brasileiro:");
        clockBR.exibirHoraFormatada();

        System.out.println("relogio padrao americano:");
        clockUS.exibirHoraFormatada();


        System.out.println("sincronizando relogio americano com o brasileiro...");
        System.out.println("relogio padrao americano sincronizado: ");
        clockUS.sincronizarRelogio(clockBR);
        clockUS.exibirHoraFormatada();

        System.out.println("sincronizando relogio brasileiro com o americano...");
        System.out.println("relogio padrao brasileiro sincronizado: ");
        clockBR.sincronizarRelogio(clockUS);
        clockBR.exibirHoraFormatada();

    }
}
