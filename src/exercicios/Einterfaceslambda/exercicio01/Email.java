package exercicios.Einterfaceslambda.exercicio01;

public class Email implements ServicoMensagem {
    
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("\nenviando \"" + mensagem + "\" por email...");        
    }
}
