package exercicio21;

public class Livro {
    public String titulo;
    public String autor;
    public String isbn;

    public Livro(String titulo, String autor, String isbn){
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }
    public String getDados() {
        return titulo + " - " + autor;
    }
}
