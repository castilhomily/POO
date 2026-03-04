
import java.util.Scanner;

public class teste02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int quantidade;

        System.out.println("Nome do produto: ");
        nome = sc.next();
        System.out.println("Valor do produto: ");
        valor = sc.nextDouble();
        System.out.println("Quantidade inicial em estoque: ");
        quantidade = sc.nextInt();

        teste03 teste03 = new teste03(nome, valor, quantidade);

        System.out.println(teste03.valor);
        System.out.println(teste03);

    }
}

