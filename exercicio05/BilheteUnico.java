package Static.Exercicio03;

import java.util.Random;

public class BilheteUnico {
    String usuario;
    int numeroBilhete;
    double saldo;
    String tipoTarifa;

    final static double tarifa = 5.50;

    public BilheteUnico(String usuario, String tipoTarifa){
        Random rd = new Random();
        this.numeroBilhete = rd.nextInt(1000, 9999);
        this.usuario = usuario;
        this.tipoTarifa = tipoTarifa;
        this.saldo = 0;
    }

    public void carregar(double valor){
        saldo += valor;
    }

    public boolean passarNaCatraca() {
        double valor =tarifa;
        if (tipoTarifa.equalsIgnoreCase("professor") ||
                tipoTarifa.equalsIgnoreCase("estudante")){
            valor = tarifa /2;
        }
        if (saldo < valor) {
            return false;
        }

        saldo -= valor;
        return true;

    }


}
