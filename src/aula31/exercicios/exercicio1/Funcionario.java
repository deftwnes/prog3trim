package aula31.exercicios.exercicio1;
/**
 * Classe abstrata Funcionario que representa um funcionário genérico.
 * Contém os atributos comuns a todos os tipos de funcionários e define o método abstrato calcularSalario().
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    /**
     * Construtor da classe Funcionario.
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Método abstrato para calcular o salário do funcionário.
     * Deve ser implementado pelas subclasses.
     * @return O valor do salário calculado.
     */
    public abstract double calcularSalario();
}

/**
 * Interface Pagamento que define o método para processar o pagamento dos funcionários.
 */
interface Pagamento {
    /**
     * Método para processar o pagamento do funcionário.
     * @return O valor do pagamento processado.
     */
    double processarPagamento();
}
