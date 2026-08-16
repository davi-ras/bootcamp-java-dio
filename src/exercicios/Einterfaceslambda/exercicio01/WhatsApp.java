package exercicios.Einterfaceslambda.exercicio01;

public class WhatsApp implements ServicoMensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("enviando \"" + mensagem + "\" por WhatsApp...");        
    }
}
