package aula31.exercicios.exercicio5;
/**
 * Classe Reptil que representa um réptil no zoológico.
 * Implementa os métodos de emitir som, alimentar e cuidar.
 */
class Reptil extends Animal implements Cuidador {

    /**
     * Construtor da classe Reptil.
     * @param nome Nome do réptil.
     * @param idade Idade do réptil.
     * @param especie Espécie do réptil.
     */
    public Reptil(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Emite o som característico de um réptil.
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " (Réptil) está emitindo um som sibilante.");
    }

    /**
     * Alimenta o réptil com alimentos específicos.
     */
    @Override
    public void alimentar() {
        System.out.println(nome + " (Réptil) está sendo alimentado com insetos.");
    }

    /**
     * Realiza ações de cuidado específicas para o réptil.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando de " + nome + " (Réptil): Controle de temperatura e umidade do recinto.");
    }
}
