package aula31.exercicios.exercicio5;
/**
 * Classe abstrata Animal que representa um animal genérico no zoológico.
 * Contém os atributos comuns a todos os animais e define os métodos abstratos para emitir som e alimentar.
 */
public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String especie;

    /**
     * Construtor da classe Animal.
     * @param nome Nome do animal.
     * @param idade Idade do animal.
     * @param especie Espécie do animal.
     */
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    /**
     * Método abstrato para emitir som.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void emitirSom();

    /**
     * Método abstrato para alimentar o animal.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void alimentar();
}
