package exercicios.Dherancapolimorfismo.exercicio03;

public class RelogioBR extends Relogio {

    public void setHora(int hora) {
        if (hora >= 0 && hora <=23) {
            super.hora = hora;

        } else {
            System.out.println("hora invalida!");

        }
    }

    @Override
    public void exibirHoraFormatada() {
        System.out.printf("\n%02d:%02d:%02d\n\n", super.hora, super.minuto, super.segundo);

    }

    @Override
    public void sincronizarRelogio(Relogio relogio) {
        this.minuto = relogio.getMinuto();
        this.segundo = relogio.getSegundo();

        if (relogio instanceof RelogioUS) {
            RelogioUS relogioAmericano = (RelogioUS) relogio;

            if (!relogioAmericano.isAM() && relogioAmericano.getHora() != 12) {
                this.hora = relogioAmericano.getHora() + 12;

            } else if (relogioAmericano.isAM() && relogioAmericano.getHora() == 12) {
                this.hora = 0;

            } else {
                this.hora = relogioAmericano.getHora();

            }
        } else {
            this.hora = relogio.getHora();

        }
    }
}
