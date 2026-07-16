package exercicios.Cclassesencapsulamento.exercicio02;

public class Carro {
    private boolean carroLigado;
    private int velocidade = 0;
    private int marcha = 0;

    public boolean isVelocidadeCompativel(int novaMarcha, int velocidadeAtual) {
        switch (novaMarcha) {
            case 0:
                return velocidadeAtual == 0;

            case 1:
                return velocidadeAtual  >= 0 && velocidadeAtual <= 20;

            case 2:
                return velocidadeAtual >= 20 && velocidadeAtual <= 40;

            case 3:
                return velocidadeAtual >= 40 && velocidadeAtual <= 60;

            case 4:
                return velocidadeAtual >= 60 && velocidadeAtual <= 80;

            case 5:
                return velocidadeAtual >= 80 && velocidadeAtual <= 100;

            case 6:
                return velocidadeAtual >= 100 && velocidadeAtual <= 120;

            default:
                return false;
        }
    }

    public void ligarCarro() {
        if (!carroLigado) {
            this.carroLigado = true;
            System.out.println("\nO carro foi ligado.");

        } else {
            System.out.println("\nO carro ja esta ligado.");

        }
    }

    public void desligarCarro() {
        if (carroLigado) {
            if (marcha == 0 && velocidade == 0) {
                this.carroLigado = false;
                System.out.println("\nO carro foi desligado.");

            } else {
                System.out.println("\nO carro deve ser estar no ponto morto (marcha 0) e em repouso para ser desligado.");
            }

        } else {
            System.out.println("\nO carro ja esta desligado.");

        }
    }

    public void acelerarCarro() {
        if (carroLigado) {
            if (this.marcha == 0) {
                System.out.println("\nO carro esta em ponto morto (marcha 0). Engate a 1a marcha para acelerar.");
                return;

            }

            // necessario para verificar se a velocidade futura precisa da proxima marcha
            int velocidadeFutura = this.velocidade + 1;

            if (isVelocidadeCompativel(this.marcha, velocidadeFutura)) {
                this.velocidade = velocidadeFutura;
                System.out.println("\nAcelerando...");
                System.out.println("Velocidade atual: " + this.velocidade + " Km/h.");

            } else {
                System.out.println("\nLimite de velocidade atingido para a marcha. Troque de marcha para continuar acelerando.");

            }

        } else {
            System.out.println("\nO carro esta desligado, nao e possivel acelerar.");

        }
    }

    public void diminuirVelocidade() {
        if (carroLigado) {
            if (velocidade > 0) {
                this.velocidade --;
                System.out.println("\nDiminuindo velocidade...");
                System.out.println("Velocidade atual: " + this.velocidade + " Km/h.");

            } else {
                System.out.println("\nNao e possivel diminuir a velocidade. O carro esta parado. ");

            }

        } else {
            System.out.println("\nO carro esta desligado.");

        }
    }

    public void virarEsquerdaDireita() {
        if (carroLigado) {
            if (velocidade >= 1 && velocidade <= 40) {
                System.out.println("\nVirando o carro...");

            } else {
                System.out.println("\nO carro precisa estar entre 1 a 40 km/h para virar o carro.");

            }

        } else {
            System.out.println("\nO carro esta desligado.");

        }
    }

    public void verificarVelocidade() {
        if (carroLigado) {
            System.out.println("\nVelocidade atual do carro: " + this.velocidade + " Km/h.");

        } else {
            System.out.println("\nO carro esta desligado.");

        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (carroLigado) {
            if (Math.abs(this.marcha - novaMarcha) == 1) {

                if (isVelocidadeCompativel(novaMarcha, this.velocidade)) {
                    this.marcha = novaMarcha;
                    System.out.println("\nA marcha foi trocada para a " + novaMarcha + ".");

                } else {
                    System.out.println("\nNao e possivel engatar a marcha " + novaMarcha + " na velocidade atual de " + this.velocidade + " Km/h.");

                }

            } else {
                System.out.println("\nNao e possivel pular marchas.");
            }

        } else {
            System.out.println("\nO carro esta desligado.");

        }

    }
}




