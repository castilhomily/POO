package exercicio21;

public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = "";
    }

    public void devolver(String data) {
        this.dataDevolucao = data;
    }

    public String getDados() {
        return livro.getDados() +
                "\n" + usuario.getDados() +
                "\nData: " + dataEmprestimo +
                "\nDevolução: " + dataDevolucao;
    }
}