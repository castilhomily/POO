package Exercicio03;

public class Bilhete_único {
    int numeroBilhete;
    String usuario;
    double saldo;
    String tipo;

    public static double tarifaBase = 5.0;

    public Bilhete_único(String usuario, String tipo) {
        this.numeroBilhete = (int) (Math.random() * 9000) + 1000; // 1000 a 9999
        this.usuario = usuario;
        this.saldo = 0.0;
        this.tipo = tipo.toLowerCase();
    }


    public void carregar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Saldo carregado: R$ " + valor);
        } else {
            System.out.println("Valor inválido para recarga.");
        }
    }

    public void passarNaCatraca() {
        double tarifa = tarifaBase;


        if (tipo.equals("estudante") || tipo.equals("professor")) {
            tarifa = tarifaBase / 2;
        }

        if (saldo >= tarifa) {
            saldo -= tarifa;
            System.out.println("Passagem aprovada. Tarifa: R$ " + tarifa);
        } else {
            System.out.println("Saldo insuficiente. Por favor, carregue o bilhete.");
        }
    }


    public void mostrarInfo() {
        System.out.println("Número do bilhete: " + numeroBilhete);
        System.out.println("Usuário: " + usuario);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
