package aula31.exercicios.exercicio1;

/**
 * Classe FuncionarioComissionado que representa um funcionário comissionado.
 * Implementa o cálculo do salário para funcionários comissionados.
 */
class FuncionarioComissionado extends Funcionario implements Pagamento {
    private double vendasTotais;
    private double percentualComissao;

    /**
     * Construtor da classe FuncionarioComissionado.
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     * @param vendasTotais Valor total das vendas realizadas pelo funcionário.
     * @param percentualComissao Percentual de comissão sobre as vendas.
     */
    public FuncionarioComissionado(String nome, double salarioBase, double vendasTotais, double percentualComissao) {
        super(nome, salarioBase);
        this.vendasTotais = vendasTotais;
        this.percentualComissao = percentualComissao;
    }

    /**
     * Calcula o salário do funcionário comissionado com base no salário base e na comissão sobre as vendas.
     * @return O salário comissionado calculado.
     */
    @Override
    public double calcularSalario() {
        return salarioBase + (vendasTotais * percentualComissao);
    }

    /**
     * Processa o pagamento do funcionário comissionado.
     * @return O valor do salário calculado.
     */
    @Override
    public double processarPagamento() {
        return calcularSalario();
    }
}
