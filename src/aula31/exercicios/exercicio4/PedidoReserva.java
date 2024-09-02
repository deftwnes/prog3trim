package aula31.exercicios.exercicio4;

/**
 * Classe PedidoReserva que representa um pedido de reserva no restaurante.
 * Implementa as regras de manipulação de itens e cálculo do total para um pedido de reserva.
 */
class PedidoReserva extends Pedido {

    /**
     * Construtor da classe PedidoReserva.
     * @param numeroPedido Número do pedido.
     */
    public PedidoReserva(int numeroPedido) {
        super(numeroPedido);
    }

    /**
     * Adiciona um item ao pedido de reserva.
     * @param item Nome do item a ser adicionado.
     */
    @Override
    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println("Item " + item + " adicionado ao pedido de reserva " + numeroPedido);
    }

    /**
     * Remove um item do pedido de reserva.
     * @param item Nome do item a ser removido.
     */
    @Override
    public void removerItem(String item) {
        if (itens.remove(item)) {
            System.out.println("Item " + item + " removido do pedido de reserva " + numeroPedido);
        } else {
            System.out.println("Item " + item + " não encontrado no pedido de reserva " + numeroPedido);
        }
    }

    /**
     * Calcula o total do pedido de reserva.
     * Neste exemplo, um pedido de reserva pode não ter um valor total associado diretamente.
     * @return O valor total do pedido de reserva (neste caso, 0.0).
     */
    @Override
    public double calcularTotal() {
        return 0.0; // As reservas podem não ter um custo associado
    }
}