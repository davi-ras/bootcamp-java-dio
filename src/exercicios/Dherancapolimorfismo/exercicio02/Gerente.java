package exercicios.Dherancapolimorfismo.exercicio02;

public class Gerente extends Funcionario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatorio...");
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas...");
    }


}
