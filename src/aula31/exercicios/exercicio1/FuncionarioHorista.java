package aula31.exercicios.exercicio1;
/**
 * Classe FuncionarioHorista que representa um funcionário horista.
 * Implementa o cálculo do salário para funcionários horistas.
 */
class FuncionarioHorista extends Funcionario implements Pagamento {
    private int horasTrabalhadas;
    private double valorHora;

    /**
     * Construtor da classe FuncionarioHorista.
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     * @param horasTrabalhadas Quantidade de horas trabalhadas no mês.
     * @param valorHora Valor da hora trabalhada.
     */
    public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    /**
     * Calcula o salário do funcionário horista com base nas horas trabalhadas e no valor da hora.
     * @return O salário horista calculado.
     */
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    /**
     * Processa o pagamento do funcionário horista.
     * @return O valor do salário calculado.
     */
    @Override
    public double processarPagamento() {
        return calcularSalario();
    }
}
