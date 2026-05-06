package exercicio21;

public class Usuario {
    public String cpf;
    public String nome;

    public Usuario(String nome, String cpf) {
    }

    public String getDados() {

        return nome + " - " + cpf;
    }
}
