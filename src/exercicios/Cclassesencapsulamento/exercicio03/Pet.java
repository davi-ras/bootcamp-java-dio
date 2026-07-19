package exercicios.Cclassesencapsulamento.exercicio03;

public class Pet {
    private String nome;
    private boolean isLimpo;

    public Pet(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean isLimpo() {
        return isLimpo;
    }

    public void setLimpo() {
        isLimpo = true;
    }
}
