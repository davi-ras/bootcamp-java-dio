package exercicios.Cclassesencapsulamento.exercicio01;

public class Conta {
    private double saldo;
    private final double limiteChequeEspecial;
    private double usoChequeEspecial;

    public Conta(double valorDepositoInicial) {
        this.saldo = valorDepositoInicial;
        this.usoChequeEspecial = 0;

        if (valorDepositoInicial <= 500) {
            this.limiteChequeEspecial = 50;

        } else {
            this.limiteChequeEspecial = valorDepositoInicial * 0.5;

        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito) {
        if (usoChequeEspecial > 0) {
            double taxa = usoChequeEspecial * 0.2;

            double divida = usoChequeEspecial + taxa;

            this.saldo = 0;

            if (valorDeposito > divida) {
                this.saldo = valorDeposito - divida;
                this.usoChequeEspecial = 0;

            } else {
                this.usoChequeEspecial = divida - valorDeposito;
                this.saldo = -usoChequeEspecial;

            }

        } else {
            this.saldo += valorDeposito;

        }
    }

    public void sacar(double valorSaque) {
        double valorLimiteSaque = saldo + limiteChequeEspecial;

        if (valorLimiteSaque >= valorSaque) {
            this.saldo -= valorSaque;

            if (saldo < 0) {

                this.usoChequeEspecial = Math.abs(saldo);

            }

        } else {
            System.out.println("\nOperacao nao concluida: Voce nao tem limite para realizar essa transacao.");
        }

    }

    public void pagarBoleto(double valorBoleto) {
        sacar(valorBoleto);
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public double getUsoChequeEspecial() {
        return usoChequeEspecial;
    }

    public boolean isUsingChequeEspecial() {
        return usoChequeEspecial > 0;
    }

}
