package exercicios.Dherancapolimorfismo.exercicio03;

public class RelogioUS extends Relogio{
    protected boolean isAM;

    public boolean isAM() {
        return isAM;
    }

    public void setAM(boolean isAM) {
        this.isAM = isAM;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <=12) {
            super.hora = hora;

        } else {
            System.out.println("hora invalida!");

        }
    }

    @Override
    public void sincronizarRelogio(Relogio relogio) {
        this.minuto = relogio.getMinuto();
        this.segundo = relogio.getSegundo();

        int horaExterna = relogio.getHora();

        if (horaExterna == 0) {
            this.hora = 12;
            this.isAM = true;
        } else if (horaExterna == 12) {
            this.hora = 12;
            this.isAM = false;
        } else if (horaExterna >= 13 && horaExterna <= 23) {
            this.hora = horaExterna - 12;
            this.isAM = false;
        } else {
            this.hora = horaExterna;
            this.isAM = true;
        }
    }

    @Override
    public void exibirHoraFormatada() {
        if (this.isAM) {
            System.out.printf("\n%02d:%02d:%02dAM\n\n", super.hora, super.minuto, super.segundo);

        } else {
            System.out.printf("\n%02d:%02d:%02dPM\n\n", super.hora, super.minuto, super.segundo);
        }

    }
}