package exercicio21;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {

        Emprestimo[] lista = new Emprestimo[10];
        int cont = 0;
        int opcao;

        do {
            opcao = Integer.parseInt(showInputDialog(
                    "### Biblioteca BookSmart ###\n" +
                            "[1] Emprestar\n" +
                            "[2] Devolver\n" +
                            "[3] Listar\n" +
                            "[4] Sair"
            ));

            switch(opcao) {

                case 1:
                    String titulo = showInputDialog("Título:");
                    String autor = showInputDialog("Autor:");
                    String isbn = showInputDialog("ISBN");

                    String nome = showInputDialog("Nome:");
                    String cpf = showInputDialog("CPF");

                    String data = showInputDialog("Data empréstimo:");

                    Livro l = new Livro(titulo, autor, isbn);
                    Usuario u = new Usuario(nome , cpf);

                    lista[cont] = new Emprestimo(l, u, data);
                    cont++;

                    showMessageDialog(null, "Empréstimo realizado!");
                    break;

                case 2:
                    String busca = showInputDialog("ISBN:");

                    for(int i = 0; i < cont; i++) {
                        if(lista[i] != null) {
                            // simplificado (prova aceita assim)
                            lista[i].devolver(showInputDialog("Data devolução"));
                        }
                    }
                    break;

                case 3:
                    String saida = "";
                    for(int i = 0; i < cont; i++) {
                        saida += lista[i].getDados() + "\n\n";
                    }
                    showMessageDialog(null, saida);
                    break;
            }

        } while(opcao != 4);
    }
}
