package exercicios.Einterfaceslambda.exercicio01;

public class Main {
    public static void main(String[] args) {
        ServicoMensagem email = new Email();
        ServicoMensagem redes = new RedesSociais();
        ServicoMensagem sms = new Sms();
        ServicoMensagem whats = new WhatsApp();

        email.enviarMensagem("Texto");
        redes.enviarMensagem("Texto");
        sms.enviarMensagem("Texto");
        whats.enviarMensagem("Texto");
    }
}
