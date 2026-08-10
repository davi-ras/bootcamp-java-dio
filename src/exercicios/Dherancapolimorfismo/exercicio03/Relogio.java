package exercicios.Dherancapolimorfismo.exercicio03;

public abstract class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public abstract void setHora(int hora);

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;

        } else {
            System.out.println("minuto invalido!");

        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;

        } else {
            System.out.println("segundo invalido!");

        }
    }

    public abstract void exibirHoraFormatada();

    public abstract void sincronizarRelogio(Relogio relogio);
}
