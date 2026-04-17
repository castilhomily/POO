package exercicio19;
import static javax.swing.JOptionPane.*;

public class Util {
    public void menu(){
        int opcao;
        String aux = "Reserva de Cargas, Boa Viagem\n";
        aux += "[1] Reserva\n";
        aux += "[2] Pesquisar\n";

        do {
            opcao = Integer.parseInt(showInputDialog(aux));
        } while (opcao != 6);
    }
}