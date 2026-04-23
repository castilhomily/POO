package exercicio23;
//antigo exercicio 07
public class MonitorDeEnergia {
    double[] consumo;
    int indice;

    public MonitorDeEnergia(int tamanho) {
        this.consumo = new double[tamanho];
    }

    public void registrar(double valor) {
        if (this.indice < this.consumo.length) {
            this.consumo[this.indice] = valor;
            ++this.indice;
        }

    }

    public double calcularMedia() {
        double media = (double)0.0F;

        for(double valor : this.consumo) {
            media += valor;
        }

        return media / (double)this.indice;
    }

    public double calcularMedia(int inicio, int fim) {
        double media = (double)0.0F;

        for(int i = inicio - 1; i < fim; ++i) {
            media += this.consumo[i];
        }

        return media / (double)(fim - inicio + 1);
    }
}
