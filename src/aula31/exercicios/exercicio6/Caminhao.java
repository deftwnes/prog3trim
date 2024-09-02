package aula31.exercicios.exercicio6;
/**
 * Classe Caminhao que representa um caminhão.
 * Implementa os métodos de ligar, desligar, acelerar e realizar manutenção.
 */
class Caminhao extends Veiculo implements Manutencao {

    /**
     * Construtor da classe Caminhao.
     * @param marca Marca do caminhão.
     * @param modelo Modelo do caminhão.
     * @param ano Ano de fabricação do caminhão
     */
    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Liga o caminhão.
     */
    @Override
    public void ligar() {
        System.out.println(marca + " " + modelo + " (Caminhão) está ligado.");
    }

    /**
     * Desliga o caminhão.
     */
    @Override
    public void desligar() {
        System.out.println(marca + " " + modelo + " (Caminhão) está desligado.");
    }

    /**
     * Acelera o caminhão.
     */
    @Override
    public void acelerar() {
        System.out.println(marca + " " + modelo + " (Caminhão) está acelerando.");
    }

    /**
     * Realiza a manutenção do caminhão.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no caminhão " + marca + " " + modelo + ".");
    }
}
