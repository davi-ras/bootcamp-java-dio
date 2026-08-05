package exercicios.Dherancapolimorfismo.exercicio02;

public abstract class Funcionario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean isAdmin;

    public Funcionario(String nome, String email, String senha, boolean isAdmin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdmin = isAdmin;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getSenha() {
        return senha;
    }

    public void realizarLogin() {
        System.out.println("Fazendo login...");
    }

    public void realizarLogoff() {
        System.out.println("Fazendo logoff...");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Dados alterados com sucesso!");
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso!");
    }
}
