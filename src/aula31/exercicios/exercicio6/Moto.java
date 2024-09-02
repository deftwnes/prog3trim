package aula31.exercicios.exercicio6;
/**
 * Classe Moto que representa uma moto.
 * Implementa os métodos de ligar, desligar, acelerar e realizar manutenção.
 */
class Moto extends Veiculo implements Manutencao {

    /**
     * Construtor da classe Moto.
     * @param marca Marca da moto.
     * @param modelo Modelo da moto.
     * @param ano Ano de fabricação da moto.
     */
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Liga a moto.
     */
    @Override
    public void ligar() {
        System.out.println(marca + " " + modelo + " (Moto) está ligada.");
    }

    /**
     * Desliga a moto.
     */
    @Override
    public void desligar() {
        System.out.println(marca + " " + modelo + " (Moto) está desligada.");
    }

    /**
     * Acelera a moto.
     */
    @Override
    public void acelerar() {
        System.out.println(marca + " " + modelo + " (Moto) está acelerando.");
    }

    /**
     * Realiza a manutenção da moto.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção na moto " + marca + " " + modelo + ".");
    }
}