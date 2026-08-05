package exercicios.Dherancapolimorfismo.exercicio02;

public class Main {
    public static void main(String[] args) {

        System.out.println("GERENTE");
        Gerente gerente = new Gerente("João", "joao.gerente@empresa.com", "admin123");
        gerente.realizarLogin();
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("É administrador? " + gerente.isAdmin()); // Acessível porque isAdmin é protected e está no mesmo pacote
        gerente.consultarVendas();
        gerente.gerarRelatorio();
        gerente.realizarLogoff();
        System.out.println();

        System.out.println("VENDEDOR");
        Vendedor vendedor = new Vendedor("Maria", "maria.vendedora@empresa.com", "vendedor456");
        vendedor.realizarLogin();
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("É administrador? " + vendedor.isAdmin());

        // simulando vendas
        System.out.println("Realizando vendas...");
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.realizarVenda();

        // exibir vendas
        vendedor.consultarVendas();
        vendedor.realizarLogoff();
        System.out.println();
        
        System.out.println("ATENDENTE");
        Atendente atendente = new Atendente("Pedro", "pedro.atendimento@empresa.com", "atendente789");
        atendente.realizarLogin();
        System.out.println("Nome: " + atendente.getNome());
        System.out.println("É administrador? " + atendente.isAdmin());

        // Simulando recebimento de pagamentos
        System.out.println("Recebendo pagamentos...");
        atendente.receberPagamento(1499.50);
        atendente.receberPagamento(500.50);

        System.out.println("Valor atual em caixa: R$ " + atendente.getValorEmCaixa());
        atendente.fecharCaixa();
        atendente.realizarLogoff();
    }
}