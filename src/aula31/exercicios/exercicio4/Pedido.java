package aula31.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstrata Pedido que representa um pedido genérico no restaurante.
 * Contém os atributos comuns a todos os tipos de pedidos e define os métodos abstratos para manipulação de itens e cálculo do total.
 */
public abstract class Pedido {
    protected int numeroPedido;
    protected List<String> itens;
    protected String status;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
        this.status = "Em aberto";
    }

    public abstract double calcularTotal();

    public abstract void adicionarItem(String item);

    public abstract void removerItem(String item);
}
