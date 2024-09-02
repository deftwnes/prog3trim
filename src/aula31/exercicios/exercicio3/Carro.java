package aula31.exercicios.exercicio3;
/**
 * Classe Carro que representa um carro.
 * Implementa os métodos de mover e parar, além de permitir o abastecimento com combustível.
 */
class Carro extends Transporte implements Combustivel {

    /**
     * Construtor da classe Carro.
     * @param capacidade Capacidade máxima de passageiros.
     * @param velocidadeMaxima Velocidade máxima do carro.
     */
    public Carro(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /**
     * Move o carro, simulando o comportamento de um carro em movimento.
     */
    @Override
    public void mover() {
        System.out.println("O carro está se movendo a uma velocidade de até " + velocidadeMaxima + " km/h.");
    }

    /**
     * Para o carro, simulando o comportamento de um carro parado.
     */
    @Override
    public void parar() {
        System.out.println("O carro parou.");
    }

    /**
     * Abastece o carro com combustível.
     */
    @Override
    public void abastecer() {
        System.out.println("O carro está sendo abastecido.");
    }
}
