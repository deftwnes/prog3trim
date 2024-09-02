package aula31.exercicios.exercicio6;
/**
 * Classe Carro que representa um carro.
 * Implementa os métodos de ligar, desligar, acelerar e realizar manutenção.
 */
class Carro extends Veiculo implements Manutencao {

    /**
     * Construtor da classe Carro.
     * @param marca Marca do carro.
     * @param modelo Modelo do carro.
     * @param ano Ano de fabricação do carro.
     */
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Liga o carro.
     */
    @Override
    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligado.");
    }

    /**
     * Desliga o carro.
     */
    @Override
    public void desligar() {
        System.out.println(marca + " " + modelo + " está desligado.");
    }

    /**
     * Acelera o carro.
     */
    @Override
    public void acelerar() {
        System.out.println(marca + " " + modelo + " está acelerando.");
    }

    /**
     * Realiza a manutenção do carro.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no carro " + marca + " " + modelo + ".");
    }
}
