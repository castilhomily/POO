package exercicio08;

public class Conta {
    // Atributos ou propriedades ou variáveis de instância
    String correntista;
    int numero;
    double saldo;

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar um valor na conta
    public void sacar(double valor) {
        saldo -= valor;
    }
}
