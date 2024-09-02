package aula31.exercicios.exercicio3;
/**
 * Classe abstrata Transporte que representa um meio de transporte genérico.
 * Contém os atributos comuns a todos os transportes e define os métodos abstratos mover() e parar().
 */
public abstract class Transporte {
    protected int capacidade;
    protected double velocidadeMaxima;

    /**
     * Construtor da classe Transporte.
     * @param capacidade Capacidade máxima de passageiros ou carga.
     * @param velocidadeMaxima Velocidade máxima do transporte.
     */
    public Transporte(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /**
     * Método abstrato para mover o transporte.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void mover();

    /**
     * Método abstrato para parar o transporte.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void parar();
}
