package Static.Exercicio03;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BilheteUnico bilhete;

    static {
        System.out.print("Nome do usuário ---> ");
        String usuario = sc.nextLine();
        System.out.print("Tipo de tarifa (professor / estudante / normal) --> ");
        String tipoTarifa = sc.next();

        bilhete = new BilheteUnico(usuario, tipoTarifa);
    }

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("***************************");
            System.out.println("1. Carregar bilhete");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Passar na catraca");
            System.out.println("4. Finaliza");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> carregar();
                case 2 -> consultar();
                case 3 -> catraca();
                case 4 -> System.out.println("Obrigado por usar o nosso APP");
                default -> System.out.println("Opção inválida");
            }

        }while (opcao != 4);
    }

    public static void catraca() {
        if (!bilhete.passarNaCatraca()){
            System.out.println("Saldo insuficiente");
        }
        consultar();
    }

    public static void consultar() {
        System.out.println("Saldo atual R$ " + bilhete.saldo);
    }

    public static void carregar() {
        double valor;
        System.out.print("Valor da recarga ---> R$ ");
        valor = sc.nextDouble();
        bilhete.carregar(valor);
    }
}
