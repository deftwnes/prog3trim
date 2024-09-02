package aula31.exercicios.exercicio5;
/**
 * Classe Ave que representa uma ave no zoológico.
 * Implementa os métodos de emitir som, alimentar e cuidar.
 */
class Ave extends Animal implements Cuidador {

    /**
     * Construtor da classe Ave.
     * @param nome Nome da ave.
     * @param idade Idade da ave.
     * @param especie Espécie da ave.
     */
    public Ave(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Emite o som característico de uma ave.
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " (Ave) está cantando.");
    }

    /**
     * Alimenta a ave com alimentos específicos.
     */
    @Override
    public void alimentar() {
        System.out.println(nome + " (Ave) está sendo alimentada com sementes.");
    }

    /**
     * Realiza ações de cuidado específicas para a ave.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando de " + nome + " (Ave): Limpeza da gaiola e manutenção das asas.");
    }
}

