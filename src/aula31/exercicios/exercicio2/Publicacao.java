package aula31.exercicios.exercicio2;
/**
 * Classe abstrata Publicacao que representa uma publicação genérica na biblioteca.
 * Contém os atributos comuns a todas as publicações e define os métodos abstratos emprestar() e devolver().
 */
public abstract class Publicacao {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;
    protected boolean emprestado;

    /**
     * Construtor da classe Publicacao.
     * @param titulo Título da publicação.
     * @param autor Autor da publicação.
     * @param anoPublicacao Ano de publicação.
     */
    public Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    /**
     * Método abstrato para emprestar a publicação.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void emprestar();

    /**
     * Método abstrato para devolver a publicação.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void devolver();
}