package exercicios.Einterfaceslambda.exercicio01;

public class RedesSociais implements ServicoMensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("enviando \"" + mensagem + "\" por rede social...");        
    }
}
