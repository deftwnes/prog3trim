package aula31.exercicios.exercicio3;
/**
 * Classe Aviao que representa um avião.
 * Implementa os métodos de mover e parar, além de permitir o abastecimento com combustível.
 */
class Aviao extends Transporte implements Combustivel {

    /**
     * Construtor da classe Aviao.
     * @param capacidade Capacidade máxima de passageiros ou carga.
     * @param velocidadeMaxima Velocidade máxima do avião.
     */
    public Aviao(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /**
     * Move o avião, simulando o comportamento de um avião em voo.
     */
    @Override
    public void mover() {
        System.out.println("O avião está voando a uma velocidade de até " + velocidadeMaxima + " km/h.");
    }

    /**
     * Para o avião, simulando o comportamento de um avião em solo.
     */
    @Override
    public void parar() {
        System.out.println("O avião pousou e parou.");
    }

    /**
     * Abastece o avião com combustível.
     */
    @Override
    public void abastecer() {
        System.out.println("O avião está sendo abastecido.");
    }
}