package exercicios.Cclassesencapsulamento.exercicio03;

public class MaquinaBanho {
    private double reservatorioAgua;
    private double reservatorioShampoo;
    private boolean isMaquinaOcupada;
    private boolean isMaquinaSuja;
    private Pet petMaquina;


    public void darBanhoPet() {
        if (petMaquina != null) {
            if (!petMaquina.isLimpo()) {
                if (reservatorioAgua >= 10 && reservatorioShampoo >= 2) {
                    this.reservatorioAgua -= 10;
                    this.reservatorioShampoo -= 2;
                    petMaquina.setLimpo();
                    this.isMaquinaSuja = false;
                    System.out.println("\nO pet " + petMaquina.getNome() + " foi limpo.");

                } else {
                    System.out.println("\nNao foi possivel realizar o banho. Insumos dos reservatorios sao insuficientes.");

                }
            } else {
                System.out.println("\nO pet da maquina ja esta limpo.");

            }

        } else {
            System.out.println("\nNao ha pet na maquina.");

        }
    }

    public void abastecerAgua() {
        if (reservatorioAgua < 30) {
            this.reservatorioAgua += 2;

            if (this.reservatorioAgua > 30) {
                this.reservatorioAgua = 30;
            }

            System.out.println("\nO reservatorio foi abastecido. Ha " + reservatorioAgua + "L no total.");

        } else {
            System.out.println("\nNao e possivel adicionar mais agua. O reservatorio esta cheio.");

        }
    }

    public void abastecerShampoo() {
        if (reservatorioShampoo < 10) {
            this.reservatorioShampoo += 2;

            if (this.reservatorioShampoo > 10) {
                this.reservatorioShampoo = 10;
            }

            System.out.println("\nO reservatorio foi abastecido. Ha " + reservatorioShampoo + "L no total.");

        } else {
            System.out.println("\nNao e possivel adicionar mais shampoo. O reservatorio esta cheio.");

        }
    }

    public void verificarAgua() {
        System.out.println("\nO reservatorio esta com " + reservatorioAgua + "L de agua.");

    }

    public void verificarShampoo() {
        System.out.println("\nO reservatorio esta com " + reservatorioShampoo + "L de shampoo.");

    }

    public void verificarUsoMaquina() {
        if (isMaquinaOcupada) {
            System.out.println("\nA maquina esta ocupada. Pet: " + petMaquina.getNome());

        } else {
            System.out.println("\nA maquina esta esta vazia.");

        }
    }

    public void colocarPetMaquina(Pet petX) {
        if (!isMaquinaOcupada) {
            if (!isMaquinaSuja) {
                this.petMaquina = petX;
                this.isMaquinaOcupada = true;
                System.out.println("\nO pet " + petX.getNome() + " foi colocado na maquina.");

            } else {
                System.out.println("\nA maquina esta suja. Limpe a maquina antes de colocar o pet.");
            }

        } else {
            System.out.println("\nNao e possivel colocar o pet " + petX.getNome() + " na maquina. A maquina esta ocupada pelo pet " + petMaquina.getNome());

        }
    }

    public void retirarPetMaquina() {
        if (isMaquinaOcupada) {
            if (petMaquina.isLimpo()) {
                this.petMaquina = null;
                this.isMaquinaOcupada = false;
                this.isMaquinaSuja = false;
                System.out.println("\nO pet foi retirado da maquina.");

            } else {
                this.petMaquina = null;
                this.isMaquinaOcupada = false;
                this.isMaquinaSuja = true;
                System.out.println("\nO pet foi retirado da maquina.");

            }

        } else {
            System.out.println("\nA maquina ja esta vazia.");

        }

    }

    public void limparMaquina() {
        if (isMaquinaSuja) {
            if (reservatorioAgua >= 3 && reservatorioShampoo >= 1) {
                this.reservatorioAgua -= 3;
                this.reservatorioShampoo -= 1;
                this.isMaquinaSuja = false;
                System.out.println("\nA maquina foi limpa.");

            } else {
                System.out.println("\nNao foi possivel limpar a maquina. Insumos dos reservatorios sao insuficientes.");

            }

        } else {
            System.out.println("\nA maquina ja esta limpa.");

        }
    }
}
