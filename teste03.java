
public class teste03 {

    String nome;
    double valor;
    int quantidade;

    public teste03(String n, double v, int q) {
        nome = n;
        valor = v;
        quantidade = q;
    }

    void aumentarValor(double porcentagem) {
        valor = valor + (valor * porcentagem / 100);
    }

    public static void main(String[] args) {
        teste03 p = new teste03("Notebook", 3000, 10);
        System.out.println("Valor antes: " + p.valor);
        p.aumentarValor(10);
        System.out.println("Valor depois: " + p.valor);
    }
}

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

        Produto produto = new Produto(nome, valor, quantidade);

        System.out.println(produto.valor);


    }
}
