package aula31.exercicios.exercicio5;
/**
 * Classe Mamifero que representa um mamífero no zoológico.
 * Implementa os métodos de emitir som, alimentar e cuidar.
 */
class Mamifero extends Animal implements Cuidador {

    /**
     * Construtor da classe Mamifero.
     * @param nome Nome do mamífero.
     * @param idade Idade do mamífero.
     * @param especie Espécie do mamífero.
     */
    public Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Emite o som característico de um mamífero.
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " (Mamífero) está emitindo som.");
    }

    /**
     * Alimenta o mamífero com alimentos específicos.
     */
    @Override
    public void alimentar() {
        System.out.println(nome + " (Mamífero) está sendo alimentado com carne.");
    }

    /**
     * Realiza ações de cuidado específicas para o mamífero.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando de " + nome + " (Mamífero): Limpeza do recinto e checagem de saúde.");
    }
}
