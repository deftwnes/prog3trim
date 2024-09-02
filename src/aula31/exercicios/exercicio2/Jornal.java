package aula31.exercicios.exercicio2;

/**
 * Classe Jornal que representa um jornal na biblioteca.
 * Implementa as regras de empréstimo e devolução para jornais.
 */
class Jornal extends Publicacao implements Reservavel {

    /**
     * Construtor da classe Jornal.
     * @param titulo Título do jornal.
     * @param autor Autor do jornal.
     * @param anoPublicacao Ano de publicação do jornal.
     */
    public Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    /**
     * Empresta o jornal, marcando-o como emprestado.
     */
    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Jornal '" + titulo + "' emprestado com sucesso.");
        } else {
            System.out.println("Jornal '" + titulo + "' já está emprestado.");
        }
    }

    /**
     * Devolve o jornal, marcando-o como disponível.
     */
    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Jornal '" + titulo + "' devolvido com sucesso.");
        } else {
            System.out.println("Jornal '" + titulo + "' não está emprestado.");
        }
    }

    /**
     * Reserva o jornal, se ele não estiver emprestado.
     */
    @Override
    public void reservar() {
        if (!emprestado) {
            System.out.println("Jornal '" + titulo + "' reservado com sucesso.");
        } else {
            System.out.println("Jornal '" + titulo + "' não pode ser reservado, pois já está emprestado.");
        }
    }
}