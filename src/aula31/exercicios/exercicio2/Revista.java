package aula31.exercicios.exercicio2;
/**
 * Classe Revista que representa uma revista na biblioteca.
 * Implementa as regras de empréstimo e devolução para revistas.
 */
class Revista extends Publicacao implements Reservavel {

    /**
     * Construtor da classe Revista.
     * @param titulo Título da revista.
     * @param autor Autor da revista.
     * @param anoPublicacao Ano de publicação da revista.
     */
    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    /**
     * Empresta a revista, marcando-a como emprestada.
     */
    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Revista '" + titulo + "' emprestada com sucesso.");
        } else {
            System.out.println("Revista '" + titulo + "' já está emprestada.");
        }
    }

    /**
     * Devolve a revista, marcando-a como disponível.
     */
    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Revista '" + titulo + "' devolvida com sucesso.");
        } else {
            System.out.println("Revista '" + titulo + "' não está emprestada.");
        }
    }

    /**
     * Reserva a revista, se ela não estiver emprestada.
     */
    @Override
    public void reservar() {
        if (!emprestado) {
            System.out.println("Revista '" + titulo + "' reservada com sucesso.");
        } else {
            System.out.println("Revista '" + titulo + "' não pode ser reservada, pois já está emprestada.");
        }
    }
}
