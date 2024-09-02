package aula31.exercicios.exercicio6;
/**
 * Classe abstrata Veiculo que representa um veículo genérico.
 * Contém os atributos comuns a todos os veículos e define os métodos abstratos para ligar, desligar e acelerar.
 */
public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    /**
     * Construtor da classe Veiculo.
     * @param marca Marca do veículo.
     * @param modelo Modelo do veículo.
     * @param ano Ano de fabricação do veículo.
     */
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    /**
     * Método abstrato para ligar o veículo.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void ligar();

    /**
     * Método abstrato para desligar o veículo.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void desligar();

    /**
     * Método abstrato para acelerar o veículo.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void acelerar();
}
