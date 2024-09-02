package aula31.exercicios.exercicio4;

/**
 * Classe PedidoDelivery que representa um pedido de delivery no restaurante.
 * Implementa as regras de manipulação de itens, cálculo do total e desconto para um pedido de delivery.
 */
class PedidoDelivery extends PedidoComum {
    private double taxaEntrega;

    public PedidoDelivery(int numeroPedido, double taxaEntrega) {
        super(numeroPedido);
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public double calcularTotal() {
        return super.calcularTotal() + taxaEntrega;
    }
}

