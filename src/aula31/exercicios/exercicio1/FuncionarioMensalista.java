package aula31.exercicios.exercicio1;

/**
 * Classe FuncionarioMensalista que representa um funcionário mensalista.
 * Implementa o cálculo do salário para funcionários mensalistas.
 */
class FuncionarioMensalista extends Funcionario implements Pagamento {

    /**
     * Construtor da classe FuncionarioMensalista.
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário do funcionário mensalista.
     * @return O salário mensalista.
     */
    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    /**
     * Processa o pagamento do funcionário mensalista.
     * @return O valor do salário calculado.
     */
    @Override
    public double processarPagamento() {
        return calcularSalario();
    }
}

