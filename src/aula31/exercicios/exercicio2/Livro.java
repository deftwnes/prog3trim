package aula31.exercicios.exercicio2;

/**
 * Classe Livro que representa um livro na biblioteca.
 * Implementa as regras de empréstimo e devolução para livros.
 */
class Livro extends Publicacao implements Reservavel {

    /**
     * Construtor da classe Livro.
     * @param titulo Título do livro.
     * @param autor Autor do livro.
     * @param anoPublicacao Ano de publicação do livro.
     */
    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    /**
     * Empresta o livro, marcando-o como emprestado.
     */
    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro '" + titulo + "' emprestado com sucesso.");
        } else {
            System.out.println("Livro '" + titulo + "' já está emprestado.");
        }
    }

    /**
     * Devolve o livro, marcando-o como disponível.
     */
    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro '" + titulo + "' devolvido com sucesso.");
        } else {
            System.out.println("Livro '" + titulo + "' não está emprestado.");
        }
    }

    /**
     * Reserva o livro, se ele não estiver emprestado.
     */
    @Override
    public void reservar() {
        if (!emprestado) {
            System.out.println("Livro '" + titulo + "' reservado com sucesso.");
        } else {
            System.out.println("Livro '" + titulo + "' não pode ser reservado, pois já está emprestado.");
        }
    }
}