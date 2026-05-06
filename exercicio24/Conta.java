package exercicio24;

public class Conta {
    protected String numero;
    protected double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldoDisponivel() {
        return saldo;
    }

    public String toString() {
        String aux = "";
        aux += "Número: " + numero + "\n";
        aux += "Saldo: " + String.format("%.2f", saldo) + "\n";
        return aux;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}