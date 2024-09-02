package aula31.exercicios.exercicio3;
/**
 * Classe Bicicleta que representa uma bicicleta.
 * Implementa os métodos de mover e parar, sem necessidade de combustível.
 */
class Bicicleta extends Transporte {

    /**
     * Construtor da classe Bicicleta.
     * @param capacidade Capacidade máxima (normalmente 1 pessoa).
     * @param velocidadeMaxima Velocidade máxima da bicicleta.
     */
    public Bicicleta(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /**
     * Move a bicicleta, simulando o comportamento de uma bicicleta em movimento.
     */
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo a uma velocidade de até " + velocidadeMaxima + " km/h.");
    }

    /**
     * Para a bicicleta, simulando o comportamento de uma bicicleta parada.
     */
    @Override
    public void parar() {
        System.out.println("A bicicleta parou.");
    }
}